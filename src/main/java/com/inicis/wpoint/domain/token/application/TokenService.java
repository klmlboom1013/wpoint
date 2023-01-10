package com.inicis.wpoint.domain.token.application;

import org.springframework.stereotype.Service;

import com.inicis.wpoint.domain.token.dto.TokenDto;
import com.inicis.wpoint.global.dto.ResponseDto;

@Service
public interface TokenService {
	
	TokenServiceType getApiType();

	ResponseDto execute (TokenDto requestDto);
}
