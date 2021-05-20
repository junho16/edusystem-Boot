package com.edusystem.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
/**
 * @author ruipeng.qi
 **/
@Configuration
public class ElasticSearchConfig {

	public static final RequestOptions COMMON_OPTIONS;

	static {
		RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
		COMMON_OPTIONS = builder.build();
	}

	@Bean
	public RestHighLevelClient client() {
		return new RestHighLevelClient(
				RestClient.builder(
						new HttpHost("127.0.0.1", 9200)));
	}
}
