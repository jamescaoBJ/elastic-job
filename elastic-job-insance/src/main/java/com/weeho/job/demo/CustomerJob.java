package com.weeho.job.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.weeho.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
@ElasticJobConf(name = "CustomerJob")
public class CustomerJob implements SimpleJob {

	public CustomerJob() {
		System.out.println("CustomerJob:init...");
	}

	@Override
	public void execute(ShardingContext shardingContext) {
		    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
			System.out.println("CustomerJob:"+shardingContext.getShardingItem()+"###start###");
			System.out.println(shardingContext.getShardingItem()+shardingContext.getJobParameter()+shardingContext.getShardingItem()+shardingContext.getShardingParameter());
			System.out.println("CustomerJob:"+shardingContext.getShardingItem()+"###end###");
	}

}
