package com.design.pattern.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.dto.CommonResponse;
import com.design.pattern.service.UtilService;

@RestController
@Validated
@RequestMapping("/utils")
public class UtilController {

	private static final Logger logger = LoggerFactory.getLogger(UtilController.class);
	
	@Autowired
	UtilService utilService;
	
	@GetMapping("/ping")
	public CommonResponse ping() {
		logger.info("entry in ping");
		CommonResponse commonResponse = null;
		try {
			commonResponse = CommonResponse.success(utilService.ping());
		} catch (Exception e) {
			commonResponse = CommonResponse.failure(e.getMessage());
		}
		logger.info("exit from ping");
		return commonResponse;
	}
}

