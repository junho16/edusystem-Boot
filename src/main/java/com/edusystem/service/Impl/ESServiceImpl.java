package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.dto.KctjDto;
import com.edusystem.dto.ScoreDto;
import com.edusystem.entity.College;
import com.edusystem.util.JWTUtils;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/22 22:40
 */
@Service
public class ESServiceImpl {

    @Autowired
    private RestHighLevelClient client;

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


            List<KctjDto> reslist = new ArrayList<>();
            //提取有用的操作数据
//            System.out.println(response.getHits().getHits());
            for(SearchHit doc : response.getHits().getHits()){
//                System.out.println( doc.getSourceAsMap() );
                reslist.add(new KctjDto(
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

}
