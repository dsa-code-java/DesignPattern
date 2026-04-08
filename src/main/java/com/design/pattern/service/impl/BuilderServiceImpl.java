package com.design.pattern.service.impl;

import org.springframework.stereotype.Service;

import com.design.pattern.dto.builder.UserBasicDetailsUserDefined;
import com.design.pattern.dto.builder.UsersBasicDetails;
import com.design.pattern.dto.validation.UserInfo;
import com.design.pattern.service.builder.BuilderPatternService;

@Service("builder-pattern")
public class BuilderServiceImpl implements BuilderPatternService {

	@Override
	public String ping() throws Exception {
		return "success";
	}

	@Override
	public UsersBasicDetails getUserByLombokBilder(UserInfo user) throws Exception {
		UsersBasicDetails userDetails = UsersBasicDetails.builder().id(user.getId())
				.email(user.getEmail())
				.name(user.getName())
				.phoneNumber(user.getPhoneNumber())
				.picode(user.getAddress().getPincode()).build();
		return userDetails;
	}

	@Override
	public UserBasicDetailsUserDefined getUserByUserDefinedBuilder(UserInfo user) throws Exception {
		UserBasicDetailsUserDefined userDetails = new UserBasicDetailsUserDefined.Builder().id(user.getId())
				.email(user.getEmail())
				.name(user.getEmail())
				.phoneNumber(user.getPhoneNumber())
				.pincode(user.getAddress().getPincode()).build();
		return userDetails;
	}

}
