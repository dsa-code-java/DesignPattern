package com.design.pattern.service.builder;

import com.design.pattern.dto.builder.UserBasicDetailsUserDefined;
import com.design.pattern.dto.builder.UsersBasicDetails;
import com.design.pattern.dto.validation.UserInfo;

public interface BuilderPatternService {

	String ping() throws Exception;
	
	UsersBasicDetails getUserByLombokBilder(UserInfo user) throws Exception;
	
	UserBasicDetailsUserDefined getUserByUserDefinedBuilder(UserInfo user) throws Exception;
}
