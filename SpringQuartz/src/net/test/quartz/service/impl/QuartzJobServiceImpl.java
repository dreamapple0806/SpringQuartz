package net.test.quartz.service.impl;

import net.test.quartz.service.QuartzJobService;

public class QuartzJobServiceImpl implements QuartzJobService {

	@Override
	public void printLog() {
		System.out.println("test log");
	}
	
}
