package com.design.pattern.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.dto.CommonResponse;
import com.design.pattern.dto.validation.UserInfo;
import com.design.pattern.service.factory.UserCreationService;
import com.design.pattern.service.factory.UserService;
import com.design.pattern.service.factory.UserUpdateService;

@RestController
@Validated
@RequestMapping("/factory")
public class FactoryDesignPattern {

private static final Logger logger = LoggerFactory.getLogger(FactoryDesignPattern.class);
	
	@Autowired
	private UserCreationService userCreationService;
	
	@Autowired
	private UserUpdateService userUpdateService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/ping")
	public CommonResponse ping() {
		logger.info("entry in ping");
		CommonResponse commonResponse = null;
		try {
			commonResponse = CommonResponse.success(userCreationService.ping());
		} catch (Exception e) {
			commonResponse = CommonResponse.failure(e.getMessage());
		}
		logger.info("exit from ping");
		return commonResponse;
	}
	
	@PostMapping("/create_user")
	public CommonResponse createUser(@Valid @RequestBody UserInfo userInfo, HttpServletRequest httpRequest) {
		logger.info("entry in create user");
		CommonResponse commonResponse = null;
		try {
			commonResponse = CommonResponse.success(userCreationService.createUser(userInfo));
		} catch (Exception e) {
			e.getMessage();
			commonResponse = CommonResponse.failure(e.getMessage());
		}
		logger.info("exit from create user");
		return commonResponse;
	}
	
	@PutMapping("/update_user")
	public CommonResponse updateUser(@Valid @RequestBody UserInfo userInfo, HttpServletRequest httpRequest) {
		logger.info("entry in update user");
		CommonResponse commonResponse = null;
		try {
			commonResponse = CommonResponse.success(userUpdateService.updateUser(userInfo));
		} catch (Exception e) {
			e.getMessage();
			commonResponse = CommonResponse.failure(e.getMessage());
		}
		logger.info("exit from update user");
		return commonResponse;
	}
	
	@GetMapping("/get_all_users")
	public CommonResponse getUsers() {
		logger.info("entry in get all users");
		CommonResponse commonResponse = null;
		try {
			commonResponse = CommonResponse.success(userService.getAllUsers());
		} catch (Exception e) {
			commonResponse = CommonResponse.failure(e.getMessage());
		}
		logger.info("exit from get all users");
		return commonResponse;
	}
}
