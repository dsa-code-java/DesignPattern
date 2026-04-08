package com.design.pattern.service.factory;

import java.util.List;

import com.design.pattern.dto.validation.UserInfo;

public interface UserService {

	List<UserInfo> getAllUsers();
}
