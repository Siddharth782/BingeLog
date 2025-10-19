package com.project.watchlist.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserLoginDTO {
	@NotBlank(message="Username can't be empty")
	private String username;
	
	@NotBlank(message="Password can't be empty")
	private String password;
}
