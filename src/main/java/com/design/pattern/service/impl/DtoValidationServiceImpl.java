package com.design.pattern.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.design.pattern.dto.validation.UserInfo;
import com.design.pattern.service.DtoValidationService;

@Service("dto-validation")
public class DtoValidationServiceImpl implements DtoValidationService {

	private static final Logger logger = LoggerFactory.getLogger(DtoValidationServiceImpl.class);
	
	@Override
	public String createUser(UserInfo userInfo, HttpServletRequest httpRequest) throws Exception {
		logger.info("user details to be create : {}", userInfo.toString());
		return "user created succesfully.";
	}

}
