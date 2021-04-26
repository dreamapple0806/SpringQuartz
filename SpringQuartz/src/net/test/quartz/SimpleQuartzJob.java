package net.test.quartz;

import net.test.quartz.service.QuartzJobService;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SimpleQuartzJob extends QuartzJobBean{
	
	private QuartzJobService quartzJobService;
	public void setQuartzJobService(QuartzJobService quartzJobService) {
		this.quartzJobService = quartzJobService;
	}


	@Override
	protected void executeInternal(JobExecutionContext ex)throws JobExecutionException {
		quartzJobService.printLog();
	}
	
}
