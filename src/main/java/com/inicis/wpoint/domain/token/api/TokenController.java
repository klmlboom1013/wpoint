package com.inicis.wpoint.domain.token.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inicis.wpoint.domain.token.application.TokenServiceFactory;
import com.inicis.wpoint.domain.token.application.TokenServiceType;
import com.inicis.wpoint.domain.token.dto.TokenDto;
import com.inicis.wpoint.domain.token.dto.requestDto.DeleteTokenDto;
import com.inicis.wpoint.domain.token.dto.requestDto.GetTokenDto;
import com.inicis.wpoint.global.dto.ResponseDto;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*", exposedHeaders = { "Content-Disposition" }, maxAge = 3600)
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/wpoint-token")
public class TokenController {

	private final TokenServiceFactory wpLnkAcctServiceFactory;

	@PostMapping(value="/{wpointUserKey}/{signature}")
	public ResponseDto add (@PathVariable String wpointUserKey, @PathVariable String signature, TokenDto requestDto) {
		return this.wpLnkAcctServiceFactory.getService(TokenServiceType.TokenAdd).execute(requestDto);
	}

	@PutMapping(value="/{wpointUserKey}/{wpointToken}/{signature}")
	public ResponseDto modify (@PathVariable String wpointUserKey, @PathVariable String wpointToken, @PathVariable String signature, TokenDto requestDto) {
		return this.wpLnkAcctServiceFactory.getService(TokenServiceType.TokenModify).execute(requestDto);
	}

	@DeleteMapping(value="/{wpointUserKey}/{wpointToken}/{signature}")
	public ResponseDto remove (@PathVariable String wpointUserKey, @PathVariable String wpointToken, @PathVariable String signature) {
		return this.wpLnkAcctServiceFactory.getService(TokenServiceType.TokenRemove).execute(DeleteTokenDto.builder().build());
	}

	@GetMapping(value="/{wpointUserKey}/{wpointToken}/{signature}")
	public ResponseDto search (@PathVariable String wpointUserKey, @PathVariable String wpointToken, @PathVariable String signature) {
		return this.wpLnkAcctServiceFactory.getService(TokenServiceType.TokenSearch).execute(GetTokenDto.builder().build());
	}

	@GetMapping(value="/{wpointUserKey}/{signature}")
	public ResponseDto searchList (@PathVariable String wpointUserKey, @PathVariable String signature) {
		return this.wpLnkAcctServiceFactory.getService(TokenServiceType.TokenSearchList).execute(GetTokenDto.builder().build());
	}
}
