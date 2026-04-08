package com.design.pattern.service.factory;

import com.design.pattern.dto.validation.UserInfo;

public interface UserCreationService {

	String ping() throws Exception;

	String createUser(UserInfo userDetails) throws Exception;
}
