package com.weeho.job.demo;

import com.weeho.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.script.ScriptJob;
@ElasticJobConf(name = "MyScriptJob")
public class MyScriptJob implements ScriptJob {

	public void execute(ShardingContext context) {
		System.out.println("james.MyScriptJob... execute.....");
	}

}
