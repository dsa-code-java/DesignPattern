package com.design.pattern.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.design.pattern.service.UtilService;

@Service("util")
public class UtilServiceImpl implements UtilService {

	private static final Logger logger = LoggerFactory.getLogger(UtilServiceImpl.class);
	
	@Override
	public String ping() throws Exception {
		logger.info("entry in util service impl at : {}", new Date());
		return "ping success";
	}

}
