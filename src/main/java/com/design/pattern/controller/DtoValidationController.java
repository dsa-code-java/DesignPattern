package com.design.pattern.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.dto.CommonResponse;
import com.design.pattern.dto.validation.UserInfo;
import com.design.pattern.service.DtoValidationService;

@RestController
@Validated
@RequestMapping("/dto-validation")
public class DtoValidationController {

	private static final Logger logger = LoggerFactory.getLogger(DtoValidationController.class);
	
	@Autowired
	DtoValidationService dtoValidationService;
	
	@PostMapping("/create_user")
	public CommonResponse createUser(@Valid @RequestBody UserInfo userInfo, HttpServletRequest httpRequest) {
		logger.info("entry in create user");
		CommonResponse commonResponse = null;
		try {
			commonResponse = CommonResponse.success(dtoValidationService.createUser(userInfo, httpRequest));
		} catch (Exception e) {
			e.getMessage();
			commonResponse = CommonResponse.failure(e.getMessage());
		}
		logger.info("exit from create user");
		return commonResponse;
	}
}
