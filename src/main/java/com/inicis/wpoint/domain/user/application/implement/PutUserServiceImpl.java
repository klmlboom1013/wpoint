package com.inicis.wpoint.domain.user.application.implement;

import org.springframework.stereotype.Service;

import com.inicis.wpoint.domain.user.application.UserService;
import com.inicis.wpoint.domain.user.application.UserServiceType;
import com.inicis.wpoint.domain.user.dto.UserDto;
import com.inicis.wpoint.domain.user.dto.requestDto.PutUserDto;
import com.inicis.wpoint.global.application.functional.ApplicationFinalProcess;
import com.inicis.wpoint.global.application.functional.ApplicationValidationCheckProcess;
import com.inicis.wpoint.global.application.template.ApplicationTemplate;
import com.inicis.wpoint.global.dto.ApplicationProcDto;
import com.inicis.wpoint.global.dto.ResponseDto;

@Service
public class PutUserServiceImpl extends ApplicationTemplate<PutUserDto> implements UserService {
	
	@Override
	public ResponseDto execute(final UserDto requestDto) {
		return super.start((PutUserDto)requestDto);
	}
	
	@Override
	public UserServiceType getApiType() {
		return UserServiceType.UserModify;
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
