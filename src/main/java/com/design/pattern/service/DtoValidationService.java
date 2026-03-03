package com.design.pattern.service;

import javax.servlet.http.HttpServletRequest;

import com.design.pattern.dto.validation.UserInfo;

public interface DtoValidationService {

	String createUser(UserInfo userInfo, HttpServletRequest httpRequest) throws Exception;
}
