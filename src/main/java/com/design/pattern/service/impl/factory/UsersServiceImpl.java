package com.design.pattern.service.impl.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.design.pattern.dto.validation.UserInfo;
import com.design.pattern.service.factory.UserCreationService;
import com.design.pattern.service.factory.UserService;
import com.design.pattern.service.factory.UserUpdateService;

@Service("user-service")
public class UsersServiceImpl implements UserCreationService, UserUpdateService, UserService {

	private List<UserInfo> users = new ArrayList<>();
	
	@Override
	public String updateUser(UserInfo userDetails) throws Exception {
		for(int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals(userDetails.getId())) {
				users.remove(i);
				users.add(i, userDetails);
			}
		}
		return "user added : " + userDetails.toString();
	}

	@Override
	public String ping() throws Exception {
		return "success";
	}

	@Override
	public String createUser(UserInfo userDetails) throws Exception {
		users.add(userDetails);
		return userDetails.toString();
	}

	@Override
	public List<UserInfo> getAllUsers() {
		return users;
	}

}
