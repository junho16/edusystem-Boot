package com.edusystem;


import com.alibaba.fastjson.JSON;
import com.edusystem.config.ElasticSearchConfig;
import lombok.Data;
import org.apache.lucene.util.QueryBuilder;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.FetchSourceContext;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
class EsApplicationTests {

	@Autowired
	private RestHighLevelClient client;

	/**
	 * 测试存储数据到es
	 * 更新也可以
	 */
	@Test
	void indexData() throws IOException {
		IndexRequest indexRequest = new IndexRequest("users");
		indexRequest.id("1");
		User user = new User("zhangsan", "男", 18);
		String jsonString = JSON.toJSONString(user);
		indexRequest.source(jsonString, XContentType.JSON);

		//执行操作
		IndexResponse index = client.index(indexRequest, ElasticSearchConfig.COMMON_OPTIONS);

		//提取有用的操作数据
		System.out.println(index);
	}

	@Data
	static class User {
		private String userName;
		private String gender;
		private Integer age;

		public User(String userName, String gender, Integer age) {
			this.userName = userName;
			this.gender = gender;
			this.age = age;
		}
	}
	//创建索引
	@Test
	void testCreateIndex() throws IOException {
		CreateIndexRequest createIndexRequest =  new CreateIndexRequest("kuang_index");
		CreateIndexResponse createIndexResponse = client.indices().create(createIndexRequest, RequestOptions.DEFAULT);
		System.out.println(createIndexResponse);
	}
	//测试获取索引
	@Test
	void testGetIndex() throws IOException {
		GetIndexRequest getIndexRequest =  new GetIndexRequest("kuang_index");
		Boolean exist = client.indices().exists(getIndexRequest, RequestOptions.DEFAULT);
		System.out.println(exist);
	}
	//测试删除索引
	@Test
	void testDeleteIndex() throws IOException {
		DeleteIndexRequest deleteIndexRequest =  new DeleteIndexRequest("kuang_index");
		AcknowledgedResponse delete = client.indices().delete(deleteIndexRequest, RequestOptions.DEFAULT);
		System.out.println(delete.isAcknowledged());
	}
	//添加文档
	@Test
	void testAddDoc() throws IOException {

//		BulkRequest--批量增加
		User user = new User("zhangsan", "男", 18);

		IndexRequest indexRequest = new IndexRequest("users");
		indexRequest.id("1");
		indexRequest.timeout(TimeValue.timeValueSeconds(1));
		indexRequest.timeout("1s");


		String jsonString = JSON.toJSONString(user);
		indexRequest.source(jsonString, XContentType.JSON);

		//执行操作
		IndexResponse index = client.index(indexRequest, ElasticSearchConfig.COMMON_OPTIONS);

		//提取有用的操作数据
		System.out.println(index);
		System.out.println(index.status());
	}

	//查找文档
	@Test
	void testQueryDoc() throws IOException {


		GetRequest getRequest = new GetRequest("users", "1");
		//不获取返回的_source的上下文
		getRequest.fetchSourceContext(new FetchSourceContext(false));
		getRequest.storedFields("_none_");
		boolean exist = client.exists(getRequest,RequestOptions.DEFAULT);
		System.out.println(exist);

		GetResponse getResponse = client.get(getRequest,RequestOptions.DEFAULT);

		//提取有用的操作数据
		System.out.println(getResponse);
		System.out.println(getResponse.getSource());
	}

	//搜索文档
	@Test
	void testSearchDoc() throws IOException {


		SearchRequest searchRequest = new SearchRequest("users", "1");

//		SearchSourceBuilder条件构造
		SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
		//查询条件
//		QueryBuilder queryBuilder = new QueryBuilder();
//		QueryBuilders.matchQuery()
//		sourceBuilder.query(queryBuilder);
		TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("name","123");
		sourceBuilder.query(termQueryBuilder);

		searchRequest.source(sourceBuilder);
		SearchResponse response = client.search(searchRequest,RequestOptions.DEFAULT);

		//提取有用的操作数据
		System.out.println(response.getHits().getHits());
		for(SearchHit doc : response.getHits().getHits()){
			System.out.println(doc.getSourceAsMap());
		}
	}

}