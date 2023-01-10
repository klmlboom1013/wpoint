package com.inicis.wpoint.domain.point.application.implement;

import org.springframework.stereotype.Service;

import com.inicis.wpoint.domain.point.application.PointService;
import com.inicis.wpoint.domain.point.dto.PointDto;
import com.inicis.wpoint.domain.point.dto.requestDto.PointChargeDto;
import com.inicis.wpoint.domain.point.enums.PointTypeCode;
import com.inicis.wpoint.global.application.functional.ApplicationFinalProcess;
import com.inicis.wpoint.global.application.functional.ApplicationValidationCheckProcess;
import com.inicis.wpoint.global.application.template.ApplicationTemplate;
import com.inicis.wpoint.global.dto.ApplicationProcDto;
import com.inicis.wpoint.global.dto.ResponseDto;

@Service
public class PointChargeServiceImpl extends ApplicationTemplate<PointChargeDto> implements PointService {

	@Override
	public ResponseDto execute(PointDto requestDto) {
		return super.start((PointChargeDto)requestDto);
	}

	@Override
	public PointTypeCode getApiType() {
		return PointTypeCode.PointCharge;
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
