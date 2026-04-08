package com.design.pattern.dto.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsersBasicDetails {

	private Long id;
	private String name;
	private Long picode;
	private String phoneNumber;
	private String email;
}
