package com.inicis.wpoint.domain.user.application;

import org.springframework.stereotype.Service;

import com.inicis.wpoint.domain.user.dto.UserDto;
import com.inicis.wpoint.global.dto.ResponseDto;

@Service
public interface UserService {
	
	/**
	 * Get API Type 
	 * @return Enum
	 */
	UserServiceType getApiType();
	
	/**
	 * Application process execute
	 * @param requestDto
	 * @return ResponseDto
	 */
	ResponseDto execute (UserDto requestDto);
}
