package com.design.pattern.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.dto.CommonResponse;
import com.design.pattern.dto.validation.UserInfo;
import com.design.pattern.service.builder.BuilderPatternService;

@RestController
@Validated
@RequestMapping("/builder")
public class BuilderPattern {

	private static final Logger logger = LoggerFactory.getLogger(BuilderPattern.class);
	
	@Autowired
	private BuilderPatternService builderPatternService;
	
	@GetMapping("/ping")
	public CommonResponse ping() {
		logger.info("entry in ping");
		CommonResponse commonResponse = null;
		try {
			commonResponse = CommonResponse.success(builderPatternService.ping());
		} catch (Exception e) {
			commonResponse = CommonResponse.failure(e.getMessage());
		}
		logger.info("exit from ping");
		return commonResponse;
	}
	
	@PostMapping("/createUserLombokBulider")
	public CommonResponse createUserLombokBulider(@Valid @RequestBody UserInfo userInfo, HttpServletRequest httpRequest) {
		logger.info("entry in createUserLombokBulider");
		CommonResponse commonResponse = null;
		try {
			commonResponse = CommonResponse.success(builderPatternService.getUserByLombokBilder(userInfo));
		} catch (Exception e) {
			e.getMessage();
			commonResponse = CommonResponse.failure(e.getMessage());
		}
		logger.info("exit from createUserLombokBulider");
		return commonResponse;
	}
	
	@PostMapping("/createUserUserDefinedBuilder")
	public CommonResponse createUserUserDefinedBuilder(@Valid @RequestBody UserInfo userInfo, HttpServletRequest httpRequest) {
		logger.info("entry in createUserUserDefinedBuilder");
		CommonResponse commonResponse = null;
		try {
			commonResponse = CommonResponse.success(builderPatternService.getUserByUserDefinedBuilder(userInfo));
		} catch (Exception e) {
			e.getMessage();
			commonResponse = CommonResponse.failure(e.getMessage());
		}
		logger.info("exit from createUserUserDefinedBuilder");
		return commonResponse;
	}
}
