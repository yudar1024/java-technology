package com.mycompany.myapp.config.sentinel;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.alibaba.csp.sentinel.datasource.Converter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ServiceConfiguration {

	@Bean
	@SentinelRestTemplate(blockHandler = "handleException", blockHandlerClass = ExceptionUtil.class)
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public RestTemplate restTemplate2() {
		return new RestTemplate();
	}

	@Bean
	public Converter myConverter() {
		return new JsonFlowRuleListConverter();
	}
}
