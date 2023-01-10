package com.inicis.wpoint.global.application.template;

import org.springframework.stereotype.Component;

import com.inicis.wpoint.global.application.functional.ApplicationFinalProcess;
import com.inicis.wpoint.global.application.functional.ApplicationValidationCheckProcess;
import com.inicis.wpoint.global.dto.ApplicationProcDto;
import com.inicis.wpoint.global.dto.RequestDto;
import com.inicis.wpoint.global.dto.ResponseDto;

@Component
public abstract class ApplicationTemplate <T extends RequestDto> {
	
	/**
	 * RequestDto Validation 검증
	 * @param requestDto
	 * @return boolean: True is OK
	 */
	protected boolean isCheckedValidation(T requestDto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Interface Service 구현체 excute 메소드에서 호출 사용.
	 * @param requestDto
	 * @return
	 */
	protected ResponseDto start (T requestDto) {

		// @Service Application process RequestDto validation check.
		if(false==isCheckedValidation(requestDto)) {
			// TODO RequestDto Validation 검증 오류 Exception 처리.
		}

		// Application Process 처리 DTO 세팅
		final ApplicationProcDto applicationProcDto = ApplicationProcDto.builder().requestDto(requestDto).build();

		// @Service Application process data validation check.
		if(false==this.validCheckProc(applicationProcDto).run()) {
			// TODO Process 진행 중 추가 Data 검증 오류 Exception 처리.
		}

		return mainProc(applicationProcDto).finalProc();
	}

	/**
	 * Application Process Validation Check 추가 사항.
	 * @param requestDto
	 * @return
	 */
	protected abstract ApplicationValidationCheckProcess validCheckProc (ApplicationProcDto applicationProcDto);

	/**
	 * API Application Main Process.
	 * @param requestDto
	 * @return ResponseDto
	 */
	protected abstract ApplicationFinalProcess mainProc(ApplicationProcDto applicationProcDto);
}
