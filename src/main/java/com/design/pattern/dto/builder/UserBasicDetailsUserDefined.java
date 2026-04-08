package com.design.pattern.dto.builder;

import lombok.Data;

@Data
public class UserBasicDetailsUserDefined {

	private Long id;
	private String name;
	private Long picode;
	private String phoneNumber;
	private String email;
	
	private UserBasicDetailsUserDefined(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.email = builder.email;
		this.phoneNumber = builder.phoneNumber;
		this.picode = builder.pincode;
	}

	@Data
	public static class Builder {
		
		private Long id;
		private String name;
		private Long pincode;
		private String phoneNumber;
		private String email;
		
		public Builder id(Long id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder pincode(Long pincode) {
			this.pincode = pincode;
			return this;
		}
		
		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public UserBasicDetailsUserDefined build() {
			return new UserBasicDetailsUserDefined(this);
		}
	}
}
