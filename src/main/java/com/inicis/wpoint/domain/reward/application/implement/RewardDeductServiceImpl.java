package com.inicis.wpoint.domain.reward.application.implement;

import org.springframework.stereotype.Service;

import com.inicis.wpoint.domain.reward.application.RewardService;
import com.inicis.wpoint.domain.reward.dto.RewardDto;
import com.inicis.wpoint.domain.reward.dto.requestDto.RewardDeductDto;
import com.inicis.wpoint.domain.reward.enums.RewardTypeCode;
import com.inicis.wpoint.global.application.functional.ApplicationFinalProcess;
import com.inicis.wpoint.global.application.functional.ApplicationValidationCheckProcess;
import com.inicis.wpoint.global.application.template.ApplicationTemplate;
import com.inicis.wpoint.global.dto.ApplicationProcDto;
import com.inicis.wpoint.global.dto.ResponseDto;

@Service
public class RewardDeductServiceImpl extends ApplicationTemplate<RewardDeductDto> implements RewardService {

	@Override
	public ResponseDto execute(RewardDto requestDto) {
		return super.start((RewardDeductDto)requestDto);
	}

	@Override
	public RewardTypeCode getApiType() {
		return RewardTypeCode.RewardDeduct;
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
