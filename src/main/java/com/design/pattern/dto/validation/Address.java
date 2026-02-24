package com.design.pattern.dto.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	@NotBlank(message = "Please enter address line")
	@Size(min = 10, max = 255, message = "Please enter address line between 10 to 255 char")
	private String line1;
	
	@Size(min = 10, max = 255, message = "Please enter address line between 10 to 255 char")
	private String line2;
	
	@NotBlank(message = "Please enter city")
	@Size(min = 2, max = 55, message = "Please enter valid city name")
	private String city;
	
	@NotBlank(message = "Please enter state")
	@Size(min = 2, max = 55, message = "Please enter valid state name")
	private String state;
	
	@NotNull(message = "Pincode must be not null")
	@Min(value = 100000, message = "Please enter valid pin")
	@Max(value = 999999, message = "Please enter valid pin")
	private Long pincode;
	
	@NotBlank(message = "Please enter country")
	@Size(min = 2, max = 55, message = "Please enter valid country")
	private String country;
}
