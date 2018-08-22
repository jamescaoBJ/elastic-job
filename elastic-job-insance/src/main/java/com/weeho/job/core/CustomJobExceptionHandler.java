package com.weeho.job.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.weeho.job.util.DingDingMessageUtil;
import com.dangdang.ddframe.job.executor.handler.JobExceptionHandler;

public class CustomJobExceptionHandler implements JobExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(CustomJobExceptionHandler.class);

    @Override
    public void handleException(String jobName, Throwable cause) {
    	System.out.println("handleException"+jobName+cause.getMessage());
        logger.error(String.format("Job '%s' exception occur in job processing", jobName), cause);
        DingDingMessageUtil.sendTextMessage("【"+jobName+"】任务异常。" + cause.getMessage());
    }

}