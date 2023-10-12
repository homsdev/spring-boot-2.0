package com.homsdev.demo.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring")
public class DataSourceConfig {
	private Map<String, Object> datasource;

	public Map<String, Object> getDatasource() {
		return datasource;
	}

	public void setDatasource(Map<String, Object> datasource) {
		this.datasource = datasource;
	}

}
