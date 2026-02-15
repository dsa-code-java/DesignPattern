package com.design.pattern.dto;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse {

	private Integer statusCode;
	private String status;
	private Object data;
	
	public static CommonResponse success(Object data) {
		return new CommonResponse(HttpStatus.OK.value(), "success", data);
	}
	
	public static CommonResponse failure(Object data) {
		return new CommonResponse(HttpStatus.CONFLICT.value(), "failure", data);
	}
}
