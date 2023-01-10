package com.inicis.wpoint.domain.token.application.implement;

import org.springframework.stereotype.Service;

import com.inicis.wpoint.domain.token.application.TokenService;
import com.inicis.wpoint.domain.token.application.TokenServiceType;
import com.inicis.wpoint.domain.token.dto.TokenDto;
import com.inicis.wpoint.domain.token.dto.requestDto.PutTokenDto;
import com.inicis.wpoint.global.application.functional.ApplicationFinalProcess;
import com.inicis.wpoint.global.application.functional.ApplicationValidationCheckProcess;
import com.inicis.wpoint.global.application.template.ApplicationTemplate;
import com.inicis.wpoint.global.dto.ApplicationProcDto;
import com.inicis.wpoint.global.dto.ResponseDto;

@Service
public class PutTokenServiceImpl extends ApplicationTemplate<PutTokenDto> implements TokenService {
	
	@Override
	public TokenServiceType getApiType() {
		return TokenServiceType.TokenModify;
	}
	
	@Override
	public ResponseDto execute(TokenDto requestDto) {
		return super.start((PutTokenDto)requestDto);
	}
	
	@Override
	protected ApplicationFinalProcess mainProc(ApplicationProcDto applicationProcDto) {
		// TODO Auto-generated method stub
		return () -> {
			return null;
		};
	}
	
	@Override
	protected ApplicationValidationCheckProcess validCheckProc(ApplicationProcDto applicationProcDto) {
		// TODO Auto-generated method stub
		return () -> {
			return false;
		};
	}
}
