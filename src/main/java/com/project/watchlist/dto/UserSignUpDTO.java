package com.project.watchlist.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserSignUpDTO {
	
	@NotBlank(message="Username can't be empty")
	private String userName;
	
	@NotBlank(message="Email can't be empty")
	private String email;
	
	@NotBlank(message="Password can't be empty")
	private String password;
	
	@NotBlank(message="Name can't be empty")
	private String fullName;
	
}
