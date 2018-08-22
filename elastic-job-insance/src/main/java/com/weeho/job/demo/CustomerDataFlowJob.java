package com.weeho.job.demo;

import java.util.ArrayList;
import java.util.List;

import com.weeho.elasticjob.annotation.ElasticJobConf;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
@ElasticJobConf(name = "CustomerDataFlowJob")
public class CustomerDataFlowJob implements DataflowJob<Object> {
	public CustomerDataFlowJob() {
	}

	@Override
	public List fetchData(ShardingContext shardingContext) {
		System.out.println(" CustomerDataFlow fetchData... ");
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<2;i++){
			list.add(i+1);
		}
		return list;
	}

	@Override
	public void processData(ShardingContext shardingContext, List data) {
		System.out.println(" CustomerDataFlow processData... ");
		/*
		List<Integer> list=data;
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		System.out.println("current："+shardingContext.getShardingItem());
		for(Foo f:list){
			System.out.println(f+":"+shardingContext.getShardingItem());
		}
		for(int a=0;a<5;a++){
			list1.add(list.get(a));
		}
		for(int a=5;a<list.size()-1;a++){
			list2.add(list.get(a));
		}
		if(shardingContext.getShardingItem()==0){
			System.out.println("start:"+shardingContext.getShardingItem());
			for(Integer va:list1){
				System.out.println("节点："+shardingContext.getShardingItem()+",处理数据:"+va);
			}
			System.out.println("end:"+shardingContext.getShardingItem());
		}else if(shardingContext.getShardingItem()==1){
			System.out.println("start:"+shardingContext.getShardingItem());
			for(Integer va:list2){
				System.out.println("节点："+shardingContext.getShardingItem()+",处理数据:"+va);
			}
			System.out.println("end:"+shardingContext.getShardingItem());
		}
	*/}

}
