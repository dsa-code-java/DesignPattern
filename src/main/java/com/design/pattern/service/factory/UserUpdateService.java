package com.design.pattern.service.factory;

import com.design.pattern.dto.validation.UserInfo;

public interface UserUpdateService {

	String updateUser(UserInfo userDetails) throws Exception;
}
