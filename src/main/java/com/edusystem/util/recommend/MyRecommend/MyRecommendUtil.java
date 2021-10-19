package com.edusystem.util.recommend.MyRecommend;

import com.edusystem.entity.KctjActive;
import com.edusystem.entity.KctjSimilarity;
import com.edusystem.entity.KctjSimilarityExample;
import com.edusystem.mapper.KctjActiveMapper;
import com.edusystem.mapper.KctjMapper;
import com.edusystem.mapper.KctjSimilarityMapper;
import com.edusystem.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 描述：用于推荐的工具类
 * @author 花菜
 * @date 2021/5/20 11:06
 */
public class MyRecommendUtil {




    /**
     * 将用户的 点击"我想看" 的行为组装成一个map,key为userId，value也是一个map，这个map记录的是课程以及它对应的点击量
     * @param userActiveList 用户的行为列表
     * @return 组装好的用户的行为的map集合
     */
    public static ConcurrentHashMap<String, ConcurrentHashMap<Integer, Long>> assembleUserBehavior
        (List<KctjActive> userActiveList) {
        ConcurrentHashMap<String, ConcurrentHashMap<Integer, Long>> activeMap =
                new ConcurrentHashMap<String, ConcurrentHashMap<Integer, Long>>();
        // 遍历查询到的用户点击行为数据
        for (KctjActive userActive : userActiveList) {
            // 1.获取用户id
            String userId = userActive.getStudentId();
            // 2.获取id
            Integer kctjId = userActive.getKctjId();
            // 3.获取该课程的点击量
            Long hits = userActive.getHits();

            // 判断activeMap中是否已经存在了该userId的信息，如果存在则进行更新
            if (activeMap.containsKey(userId)) {
                ConcurrentHashMap<Integer, Long> tempMap = activeMap.get(userId);
                tempMap.put(kctjId, hits);
                activeMap.put(userId, tempMap);
            } else {
                // 不存在则直接put进
                ConcurrentHashMap<Integer, Long> kctjMap = new ConcurrentHashMap<Integer, Long>();
                kctjMap.put(kctjId, hits);
                activeMap.put(userId, kctjMap);
            }
        }
        return activeMap;
    }

    /**
     * 计算用户与用户之间的相似性，返回计算出的用户与用户之间的相似度对象
     * @param activeMap 用户对各个课程做出的“我想看”点击行为的一个map集合
     * @return 计算出的用户与用户之间的相似度的对象存储形式
     */
    public static List<KctjSimilarity> calcSimilarityBetweenUsers
        (ConcurrentHashMap<String, ConcurrentHashMap<Integer, Long>> activeMap) {

        // 用户之间的相似度对集合
        List<KctjSimilarity> similarityList = new ArrayList<KctjSimilarity>();

        // 获取所有的键的集合--所有学生的浏览记录--点击“我想看”的点击记录
        Set<String> userSet = activeMap.keySet();

        // 把这些集合放入ArrayList中
        List<String> userIdList = new ArrayList<String>(userSet);

        // 小于两个说明当前map集合中只有一个map集合的购买行为，或者一个都没有，直接返回
        if (userIdList.size() < 2) {
            return similarityList;
        }

        // 计算所有的用户之间的相似度对
        for (int i = 0; i < userIdList.size() - 1; i++) {
            for (int j = i + 1; j < userIdList.size(); j++) {
                // 分别获取两个用户对每个二级类目的点击量
                ConcurrentHashMap<Integer, Long> userCategory2Map = activeMap.get(userIdList.get(i));
                ConcurrentHashMap<Integer, Long> userRefCategory2Map = activeMap.get(userIdList.get(j));

                // 获取两个map中课程id的集合
                Set<Integer> key1Set = userCategory2Map.keySet();
                Set<Integer> key2Set = userRefCategory2Map.keySet();
                Iterator<Integer> it1 = key1Set.iterator();
                Iterator<Integer> it2 = key2Set.iterator();

                // 两用户之间的相似度
                double similarity = 0.0;
                // 余弦相似度公式中的分子
                double molecule = 0.0;
                // 余弦相似度公式中的分母
                double denominator = 1.0;
                // 余弦相似度公式中分母根号下的两个向量的模的值
                double vector1 = 0.0;
                double vector2 = 0.0;

                while (it1.hasNext() && it2.hasNext()) {
                    Integer it1Id = it1.next();
                    Integer it2Id = it2.next();
                    // 获取二级类目对应的点击次数
                    Long hits1 = userCategory2Map.get(it1Id);
                    Long hits2 = userRefCategory2Map.get(it2Id);

                    // 累加分子
                    molecule += hits1 * hits2;

                    // 累加分母中的两个向量的模
                    vector1 += Math.pow(hits1, 2);
                    vector2 += Math.pow(hits2, 2);
                }
                // 计算分母
                denominator = Math.sqrt(vector1) * Math.sqrt(vector2);
                // 计算整体相似度
                similarity = molecule / denominator;

                // 创建用户相似度对对象
                KctjSimilarity kctjSimilarity = new KctjSimilarity();
                kctjSimilarity.setStuedntId(userIdList.get(i));
                kctjSimilarity.setStudentRefId(userIdList.get(j));
                kctjSimilarity.setSimilarity(new BigDecimal(similarity));
                // 将计算出的用户以及用户之间的相似度对象存入list集合
                similarityList.add(kctjSimilarity);
            }
        }
        return similarityList;
    }


    /**
     * 找出与userId行为最相似的topN个用户
     * @param userId 需要参考的用户id
     * @param userSimilarityList 用户相似度列表
     * @param topN 与userId相似用户的数量
     * @return 与usereId最相似的topN个用户
     */
    public static List<String> getSimilarityBetweenUsers(String userId, List<KctjSimilarity> userSimilarityList, Integer topN) {
        // 用来记录与userId相似度最高的前N个用户的id
        List<String> similarityList = new ArrayList<String>(topN);
        userSimilarityList.sort(new Comparator<KctjSimilarity>(){
            @Override
            public int compare(KctjSimilarity o1, KctjSimilarity o2) {
                return o2.getSimilarity().compareTo(o1.getSimilarity());
            }
        });
        if(topN > userSimilarityList.size() ){
            for (KctjSimilarity userSimilarity : userSimilarityList) {
//            System.out.println(userSimilarity.getStuedntId() + "\t" + userSimilarity.getStudentRefId() + "\t" + userSimilarity.getSimilarity());
                similarityList.add(userSimilarity.getStudentRefId());
            }
        }else{
            for (int i = 0 ;i < topN;i++){
                similarityList.add(userSimilarityList.get(i).getStudentRefId());
            }
        }
        return similarityList;
//        // 堆排序找出最高的前N个用户，建立小根堆，遍历的时候当前的这个相似度比堆顶元素大就剔掉堆顶的值，把这个数入堆(把小的都删除干净,所以要建立小根堆)
//        PriorityQueue<KctjSimilarity> minHeap = new PriorityQueue<KctjSimilarity>(new Comparator<KctjSimilarity>(){
//            @Override
//            public int compare(KctjSimilarity o1, KctjSimilarity o2) {
//                return o2.getSimilarity().compareTo(o1.getSimilarity());
//            }
//        });
//        for (KctjSimilarity userSimilarity : userSimilarityList) {
//            if (minHeap.size() < topN) {
//                minHeap.offer(userSimilarity);
//                System.out.println(minHeap.peek().getSimilarity());
//            } else if (minHeap.peek().getSimilarity().compareTo( userSimilarity.getSimilarity()) < 0 ) {
//                //小于
//                minHeap.poll();
//                minHeap.offer(userSimilarity);
//            }
//        }
//        // 把得到的最大的相似度的用户的id取出来(不要取它自己)
//        for (KctjSimilarity userSimilarity : minHeap) {
//            System.out.println(userSimilarity.getStuedntId() + "\t" + userSimilarity.getStudentRefId() + "\t" + userSimilarity.getSimilarity());
////            similarityList.add(userSimilarityDTO.getUserId() == userId ? userSimilarityDTO.getUserRefId() : userSimilarityDTO.getUserId());
//        }


    }





    /**
     * 找到当前用户的浏览行为列表
     * @param userId 当前用户id
     * @param userActiveList 所有用户的浏览行为列表
     * @return 当前用户的浏览行为列表
     */
    public static List<KctjActive> findUsersBrowsBehavior(
            String userId,
            List<KctjActive> userActiveList) {
        List<KctjActive> currActiveList = new ArrayList<KctjActive>();
        for (KctjActive userActive : userActiveList) {
            if (userActive.getStudentId().equals(userId)) {
                currActiveList.add(userActive);
            }
        }
        return currActiveList;
    }




}
