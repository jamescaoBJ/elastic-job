package com.weeho.job.demo;

import java.util.Arrays;
import java.util.List;

import com.weeho.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
@ElasticJobConf(name = "MyDataflowJob")
public class MyDataflowJob implements DataflowJob<String> {

	public List<String> fetchData(ShardingContext context) {
		System.out.println("MyDataflowJob");
		return Arrays.asList("1", "2", "3");
	}

	public void processData(ShardingContext context, List<String> data) {
		System.out.println("processData");
		System.out.println("james=>处理数据：" + data.toString());
	}

}
