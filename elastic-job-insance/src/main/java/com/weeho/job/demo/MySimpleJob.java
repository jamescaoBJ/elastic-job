package com.weeho.job.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.weeho.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

@ElasticJobConf(name = "MySimpleJob")
public class MySimpleJob implements SimpleJob {

	public void execute(ShardingContext context) {
		System.out.println("MySimpleJob###start###"+context.getShardingItem());
		String shardParamter = context.getShardingParameter();
		System.out.println("分片参数："+shardParamter);
		int value = Integer.parseInt(shardParamter);
		for (int i = 0; i < 2; i++) {
			if (i % 2 == value) {
				String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
				System.out.println(time + ":开始执行简单任务" + i);
			}
		}
	}

}
