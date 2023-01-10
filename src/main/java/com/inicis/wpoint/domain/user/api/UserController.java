package com.inicis.wpoint.domain.user.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inicis.wpoint.domain.user.application.UserServiceFactory;
import com.inicis.wpoint.domain.user.application.UserServiceType;
import com.inicis.wpoint.domain.user.dto.UserDto;
import com.inicis.wpoint.domain.user.dto.requestDto.DeleteUserDto;
import com.inicis.wpoint.domain.user.dto.requestDto.GetUserDto;
import com.inicis.wpoint.global.dto.ResponseDto;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*", exposedHeaders = { "Content-Disposition" }, maxAge = 3600)
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/wpoint-user")
public class UserController {

	private final UserServiceFactory wpcardServiceFactory;

	@PostMapping(value="/{signature}")
	public ResponseDto open (@PathVariable String signature, UserDto requestDto) {
		return this.wpcardServiceFactory.getService(UserServiceType.UserOpen).execute(requestDto);
	}

	@PutMapping(value="/{wpointUserKey}/{signature}")
	public ResponseDto modify (@PathVariable String wpointUserKey, @PathVariable String signature, UserDto requestDto) {
		return this.wpcardServiceFactory.getService(UserServiceType.UserModify).execute(requestDto);
	}

	@DeleteMapping(value="/{wpointUserKey}/{signature}")
	public ResponseDto close (@PathVariable String wpointUserKey, @PathVariable String signature) {
		return this.wpcardServiceFactory.getService(UserServiceType.UserClose).execute(DeleteUserDto.builder().build());
	}
	
	@GetMapping(value="/{wpointUserKey}/{signature}")
	public ResponseDto search (@PathVariable String wpointUserKey, @PathVariable String signature) {
		return this.wpcardServiceFactory.getService(UserServiceType.UserSearch).execute(GetUserDto.builder().build());
	}

}
