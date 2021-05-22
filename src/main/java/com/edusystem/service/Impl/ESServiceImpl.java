package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.dto.KctjDto;
import com.edusystem.dto.ScoreDto;
import com.edusystem.entity.*;
import com.edusystem.mapper.KctjActiveMapper;
import com.edusystem.mapper.KctjMapper;
import com.edusystem.mapper.KctjSimilarityMapper;
import com.edusystem.mapper.StudentMapper;
import com.edusystem.util.JWTUtils;
import com.edusystem.util.recommend.MyRecommend.MyRecommendUtil;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

/**
 * @author 花菜
 * @date 2021/4/22 22:40
 */
@Service
public class ESServiceImpl {

    @Autowired
    private RestHighLevelClient client;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private KctjActiveMapper kctjActiveMapper;

    @Autowired
    private KctjMapper kctjMapper;

    @Autowired
    private KctjSimilarityMapper kctjSimilarityMapper;

    public HashMap es_getcourse(Map datamap, String token) throws IOException {
        HashMap<Integer, Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
//        System.out.println(data);
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        String courseKeyword = (String)data.get("keyword");
//        String courseKeyword = datamap
        try{
            SearchRequest searchRequest = new SearchRequest("imooc_course");

            //SearchSourceBuilder条件构造
            SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();

            QueryBuilder queryBuilder = QueryBuilders.multiMatchQuery( courseKeyword,
                    "title", "content");//搜索name中或interest中包含有music的文档（必须与music一致）
            sourceBuilder.query(queryBuilder);
            searchRequest.source(sourceBuilder);
            SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);


            List<Kctj> reslist = new ArrayList<>();
            //提取有用的操作数据
//            System.out.println(response.getHits().getHits());
            for(SearchHit doc : response.getHits().getHits()){
//                System.out.println( doc.getSourceAsMap() );
                KctjExample kctjExample = new KctjExample();
                KctjExample.Criteria criteria = kctjExample.createCriteria();
                criteria.andKctjLinkEqualTo((String)doc.getSourceAsMap().get("link"));
                criteria.andKctjTitleEqualTo((String)doc.getSourceAsMap().get("title"));
                List<Kctj> kctjs = kctjMapper.selectByExample(kctjExample);

                reslist.add(new Kctj(
                        kctjs.get(0).getKctjId(),
                        (Double)doc.getSourceAsMap().get("score"),
                        (Double)doc.getSourceAsMap().get("hour"),
                        (String)doc.getSourceAsMap().get("booknum"),
                        (Double)doc.getSourceAsMap().get("price"),
                        (Double)doc.getSourceAsMap().get("studynum"),
                        (String)doc.getSourceAsMap().get("link"),
                        (String)doc.getSourceAsMap().get("hard"),
                        (String)doc.getSourceAsMap().get("title"),
                        (String)doc.getSourceAsMap().get("content")
                ));
            }
            res.put(20000,reslist);
            return res;
        }catch(Exception e){
            e.printStackTrace();
            res.put(18000,"获取您搜索的课程列表数据失败，服务器内部错误！");
            return res;
        }
    }



    public HashMap getRecommendCourse(Map datamap, String token) throws IOException {
        HashMap<Integer, Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
         DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

         try{
            //  1.查询出某个用户与其他用户的相似度列表
            List<KctjSimilarity> userSimilarityList = findUsersBrowsBehavior( username );

            // 2.打印输出
            for (KctjSimilarity userSimilarity : userSimilarityList) {
                System.out.println(userSimilarity.getStuedntId() + "\t" + userSimilarity.getStudentRefId() + "\t" + userSimilarity.getSimilarity());
            }
            System.out.println("==========================================");

            // 3.获取与某id的用户的浏览行为最相似的前5个用户
            List<String> userIds = MyRecommendUtil.getSimilarityBetweenUsers(username, userSimilarityList, 5);

            // 4.打印输出
//        System.out.println("与" + studentid + "号用户最相似的前"+"5"+"个用户为：");
//        for (String userRefId : userIds) {
//            System.out.println(userRefId);
//        }
            // 5.找出该前5名中的课程列表
            Set<Kctj> recommendateProducts = getRecommendCourse( userIds );

            // 6.打印输出
            for (Kctj kc : recommendateProducts) {
                System.out.println("被推荐的课程：" + kc.getKctjTitle());
            }
            res.put(20000,recommendateProducts);
            return res;
        }catch(Exception e){
            e.printStackTrace();
            res.put(18000,"获取课程推荐数据失败，服务器内部错误！");
            return res;
        }
    }

    /**
     * 查询出某个用户与其他用户的相似度列表
     * @param userId 当前用户id
     * @return 当前用户的浏览行为列表
     */
    public List<KctjSimilarity> findUsersBrowsBehavior(String userId ) {
        List<KctjSimilarity> userSimilarityList = new ArrayList<>();
        List<KctjSimilarity> tmp = new ArrayList<>();

        KctjSimilarityExample kctjSimilarityExample = new KctjSimilarityExample();
        KctjSimilarityExample.Criteria criteria1 = kctjSimilarityExample.createCriteria();
        criteria1.andStuedntIdEqualTo(userId);
        userSimilarityList = kctjSimilarityMapper.selectByExample(kctjSimilarityExample);

        KctjSimilarityExample kctjSimilarityExample2 = new KctjSimilarityExample();
        KctjSimilarityExample.Criteria criteria2 = kctjSimilarityExample2.createCriteria();
        criteria2.andStudentRefIdEqualTo(userId);
        tmp = kctjSimilarityMapper.selectByExample(kctjSimilarityExample2);
        for(KctjSimilarity k : tmp ){
            userSimilarityList.add(new KctjSimilarity(
                    k.getStudentRefId(),
                    k.getStuedntId(),
                    k.getSimilarity()
            ));
        }
        return userSimilarityList;
    }


    /**
     *  找出该前5名中的点击率最高的课程列表 每个人取前三个
     */
    public Set<Kctj> getRecommendCourse(List<String> userIds) {
        Set<Kctj> recommendateProducts = new HashSet<Kctj>();
        for (String userRefId : userIds) {

            KctjActiveExample kctjActiveExample = new KctjActiveExample();
            KctjActiveExample.Criteria criteria3 = kctjActiveExample.createCriteria();
            criteria3.andStudentIdEqualTo( userRefId );
            List<KctjActive> kctjActives = kctjActiveMapper.selectByExample(kctjActiveExample);
            kctjActives.sort(new Comparator<KctjActive>(){
                @Override
                public int compare(KctjActive o1, KctjActive o2) {
                    return (int) (o2.getHits() - o1.getHits());
                }
            });
            //针对每一个人看的东西 要前3个
//                System.out.println(kk.getKctjId()+" "+kk.getHits());
            if( kctjActives.size() <= 3){
                for (KctjActive kkk : kctjActives) {
                    recommendateProducts.add(
                            kctjMapper.selectByPrimaryKey(kkk.getKctjId())
                    );
                }
            }else{
                for (int i = 0 ;i < 3;i++){
                    recommendateProducts.add(
                            kctjMapper.selectByPrimaryKey(kctjActives.get(i).getKctjId())
                    );
                }
            }
        }
        return recommendateProducts;
    }

    /**
     * 更新学生的 点击"我想看" 的行为，并插入数据库中
     * @param datamap 数据
     * @param token token
     * @return true则更新成功，false则更新失败
     */
    public boolean updateHitBehavior(Map datamap, String token) {
        int res = 0;
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        Integer kcid = (Integer) data.get("kctjId");
        try{
            KctjActiveExample kctjActiveExample = new KctjActiveExample();
            KctjActiveExample.Criteria criteria1 = kctjActiveExample.createCriteria();
            criteria1.andStudentIdEqualTo(username);
            criteria1.andKctjIdEqualTo(kcid);
            List<KctjActive> isexist = kctjActiveMapper.selectByExample(kctjActiveExample);
            if(isexist.size() == 0 ){
                KctjActive kctjActive = new KctjActive(
                        username,
                        kcid, (long) 1);
                res = kctjActiveMapper.insertSelective(kctjActive);
            }else{
                KctjActive kctjActive = new KctjActive(
                        username,
                        kcid,
                        isexist.get(0).getHits()+1 );
                res = kctjActiveMapper.updateByExampleSelective(kctjActive,kctjActiveExample);
            }
            return res==0?false:true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
