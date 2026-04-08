package com.design.pattern.dto.validation;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
	
	@NotNull(message = "Id mmust be not null")
	private Long id;
	
	@NotBlank(message = "Please enter name")
	@Size(min = 2, max = 55, message = "Please enter valid name")
	private String name;
	
	@NotBlank(message = "Please enter phone number")
	@Size(min = 10, max = 10, message = "Please enter valid phone number")
	private String phoneNumber;
	
	@NotBlank(message = "Please enter email address")
	@Email(message = "Please enter valid email")
	private String email;

	@NotNull(message = "Please provide address details")
	@Valid
	private Address address;
}
