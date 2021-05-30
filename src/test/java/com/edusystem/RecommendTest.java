package com.edusystem;

import com.edusystem.entity.*;
import com.edusystem.mapper.KctjActiveMapper;
import com.edusystem.mapper.KctjMapper;
import com.edusystem.mapper.KctjSimilarityMapper;
import com.edusystem.mapper.StudentMapper;
import com.edusystem.util.recommend.MyRecommend.MyRecommendUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 花菜
 * @date 2021/5/20 15:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RecommendTest {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private KctjActiveMapper kctjActiveMapper;
    @Autowired
    private KctjMapper kctjMapper;
    @Autowired
    private KctjSimilarityMapper kctjSimilarityMapper;

    /**
     * 添加测试数据
     */
    @Test
    public void testAddData() {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentIdIsNotNull();
        List<Student> list = studentMapper.selectByExample(studentExample);

        for (int i = 0; i < 10000; i++) {
            int stu = (int) (0 + Math.random() * (list.size() - 1 - 0 + 1));
            int kcid = (int) (1 + Math.random() * (1001 - 1 + 1));
            if (kctjMapper.selectByPrimaryKey(kcid) == null) {
                continue;
            }


            KctjActiveExample kctjActiveExample = new KctjActiveExample();
            KctjActiveExample.Criteria criteria1 = kctjActiveExample.createCriteria();
            criteria1.andStudentIdEqualTo(list.get(stu).getStudentId());
            criteria1.andKctjIdEqualTo(kcid);
            List<KctjActive> isexist = kctjActiveMapper.selectByExample(kctjActiveExample);
            if (isexist.size() == 0) {
                KctjActive kctjActive = new KctjActive(
                        list.get(stu).getStudentId(),
                        kcid, (long) 1);
                kctjActiveMapper.insertSelective(kctjActive);
            } else {
                KctjActive kctjActive = new KctjActive(
                        list.get(stu).getStudentId(),
                        kcid,
                        isexist.get(0).getHits() + 1);
                kctjActiveMapper.updateByExampleSelective(kctjActive, kctjActiveExample);
            }
        }
    }


    /**
     * 测试获取两两学生之间的相似度
     */
    @Test
    public void testCalcSimilarityBetweenUser() {

        // 1.查询所有的用户浏览记录
        KctjActiveExample kctjActiveExample = new KctjActiveExample();
        KctjActiveExample.Criteria criteria1 = kctjActiveExample.createCriteria();
        criteria1.andStudentIdIsNotNull();
        criteria1.andKctjIdIsNotNull();
        List<KctjActive> actives = kctjActiveMapper.selectByExample(kctjActiveExample);

        // 2.调用推荐模块工具类的方法组装成一个ConcurrentHashMap来存储每个用户以及其对应的 点击“我想看”的课程的点击量
        ConcurrentHashMap<String, ConcurrentHashMap<Integer, Long>> activeMap = MyRecommendUtil.assembleUserBehavior(actives);

        // 3.调用推荐模块工具类的方法计算用户与用户之间的相似度
        List<KctjSimilarity> similarityList = MyRecommendUtil.calcSimilarityBetweenUsers(activeMap);

        // 4.输出计算好的用户之间的相似度
        for (KctjSimilarity usim : similarityList) {
            System.out.println(usim.getStuedntId() + "\t" + usim.getStudentRefId() + "\t" + usim.getSimilarity());

            // 5.如果用户之间的相似度已经存在与数据库中就修改，不存在就添加
            KctjSimilarityExample kctjSimilarityExample = new KctjSimilarityExample();
            KctjSimilarityExample.Criteria criteria = kctjSimilarityExample.createCriteria();
            criteria.andStuedntIdEqualTo(usim.getStuedntId());
            criteria.andStudentRefIdEqualTo(usim.getStudentRefId());
            List<KctjSimilarity> kctjSimilaritys = kctjSimilarityMapper.selectByExample(kctjSimilarityExample);

            if (kctjSimilaritys.size() == 0) { // 新增
                KctjSimilarity kctjSimilarity = new KctjSimilarity(
                        usim.getStuedntId(),
                        usim.getStudentRefId(),
                        usim.getSimilarity()
                );
                int flag = kctjSimilarityMapper.insertSelective(kctjSimilarity);
                if (flag == 1) {
                    System.out.println("插入数据成功");
                }
            } else { // 修改
                KctjSimilarity kctjSimilarity = new KctjSimilarity(
                        usim.getStuedntId(),
                        usim.getStudentRefId(),
                        usim.getSimilarity()
                );
                int flag = kctjSimilarityMapper.updateByExampleSelective(kctjSimilarity, kctjSimilarityExample);
                if (flag == 1) {
                    System.out.println("修改数据成功");
                }
            }
        }

    }

    /**
     * 测试获取与用户相似度topN的用户
     */
    @Test
    public void testGetTopNUser() {
        String studentid = "2";

        //  1.查询出某个用户与其他用户的相似度列表
        List<KctjSimilarity> userSimilarityList = new ArrayList<>();
        List<KctjSimilarity> tmp = new ArrayList<>();

        KctjSimilarityExample kctjSimilarityExample = new KctjSimilarityExample();
        KctjSimilarityExample.Criteria criteria1 = kctjSimilarityExample.createCriteria();
        criteria1.andStuedntIdEqualTo(studentid);
        userSimilarityList = kctjSimilarityMapper.selectByExample(kctjSimilarityExample);

        KctjSimilarityExample kctjSimilarityExample2 = new KctjSimilarityExample();
        KctjSimilarityExample.Criteria criteria2 = kctjSimilarityExample2.createCriteria();
        criteria2.andStudentRefIdEqualTo(studentid);
        tmp = kctjSimilarityMapper.selectByExample(kctjSimilarityExample2);
        for (KctjSimilarity k : tmp) {
            userSimilarityList.add(new KctjSimilarity(
                    k.getStudentRefId(),
                    k.getStuedntId(),
                    k.getSimilarity()
            ));
        }

        // 2.打印输出
        for (KctjSimilarity userSimilarity : userSimilarityList) {
            System.out.println(userSimilarity.getStuedntId() + "\t" + userSimilarity.getStudentRefId() + "\t" + userSimilarity.getSimilarity());
        }
        System.out.println("==========================================");

        // 3.获取与id为2L的用户的浏览行为最相似的前2个用户
        List<String> userIds = MyRecommendUtil.getSimilarityBetweenUsers(studentid, userSimilarityList, 27);

        // 4.打印输出
        System.out.println("与" + studentid + "号用户最相似的前" + "27" + "个用户为：");
        for (String userRefId : userIds) {
            System.out.println(userRefId);
        }


    }

    /**
     * 测试获取被推荐的课程列表(从被推荐的用户所想学的点击量最大的课程作为推荐的课程)
     */
    @Test
    public void testGetRecommendateProduct() {


        String studentid = "2";

        //  1.查询出某个用户与其他用户的相似度列表
        List<KctjSimilarity> userSimilarityList = new ArrayList<>();
        List<KctjSimilarity> tmp = new ArrayList<>();

        KctjSimilarityExample kctjSimilarityExample = new KctjSimilarityExample();
        KctjSimilarityExample.Criteria criteria1 = kctjSimilarityExample.createCriteria();
        criteria1.andStuedntIdEqualTo(studentid);
        userSimilarityList = kctjSimilarityMapper.selectByExample(kctjSimilarityExample);

        KctjSimilarityExample kctjSimilarityExample2 = new KctjSimilarityExample();
        KctjSimilarityExample.Criteria criteria2 = kctjSimilarityExample2.createCriteria();
        criteria2.andStudentRefIdEqualTo(studentid);
        tmp = kctjSimilarityMapper.selectByExample(kctjSimilarityExample2);
        for (KctjSimilarity k : tmp) {
            userSimilarityList.add(new KctjSimilarity(
                    k.getStudentRefId(),
                    k.getStuedntId(),
                    k.getSimilarity()
            ));
        }

        // 2.打印输出
        for (KctjSimilarity userSimilarity : userSimilarityList) {
            System.out.println(userSimilarity.getStuedntId() + "\t" + userSimilarity.getStudentRefId() + "\t" + userSimilarity.getSimilarity());
        }
        System.out.println("==========================================");

        // 3.获取与id为2L的用户的浏览行为最相似的前2个用户
        List<String> userIds = MyRecommendUtil.getSimilarityBetweenUsers(studentid, userSimilarityList, 5);

        // 4.打印输出
//        System.out.println("与" + studentid + "号用户最相似的前"+"27"+"个用户为：");
//        for (String userRefId : userIds) {
//            System.out.println(userRefId);
//        }

        // 5.找出该前5名中的课程列表
        Set<Kctj> recommendateProducts = new HashSet<Kctj>();
        for (String userRefId : userIds) {

            KctjActiveExample kctjActiveExample = new KctjActiveExample();
            KctjActiveExample.Criteria criteria3 = kctjActiveExample.createCriteria();
            criteria3.andStudentIdEqualTo(userRefId);
            List<KctjActive> kctjActives = kctjActiveMapper.selectByExample(kctjActiveExample);
            kctjActives.sort(new Comparator<KctjActive>() {
                @Override
                public int compare(KctjActive o1, KctjActive o2) {
                    return (int) (o2.getHits() - o1.getHits());
                }
            });
            //针对每一个人看的东西 要前3个
//                System.out.println(kk.getKctjId()+" "+kk.getHits());
            if (kctjActives.size() <= 3) {
                for (KctjActive kkk : kctjActives) {
                    recommendateProducts.add(
                            kctjMapper.selectByPrimaryKey(kkk.getKctjId())
                    );
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    recommendateProducts.add(
                            kctjMapper.selectByPrimaryKey(kctjActives.get(i).getKctjId())
                    );
                }
            }
        }
        // 6.打印输出
        for (Kctj kc : recommendateProducts) {
            System.out.println("被推荐的课程：" + kc.getKctjTitle());
        }
    }
}
