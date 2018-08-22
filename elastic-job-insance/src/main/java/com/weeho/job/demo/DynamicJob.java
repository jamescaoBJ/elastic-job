package com.weeho.job.demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.weeho.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

@ElasticJobConf(name = "DynamicJob")
public class DynamicJob implements SimpleJob {
	@Autowired
	CustomerJob job;

	@Override
	public void execute(ShardingContext shardingContext) {
		System.out.println("DynamicJob"+shardingContext.getJobParameter());
		job.execute(shardingContext);
		// 可以根据JobParameter来对不同的数据进行操作
		System.out.println("DynamicJob"+shardingContext.getShardingParameter());
	}

}
