package com.inicis.wpoint.domain.point.application;

import org.springframework.stereotype.Service;

import com.inicis.wpoint.domain.point.dto.PointDto;
import com.inicis.wpoint.domain.point.enums.PointTypeCode;
import com.inicis.wpoint.global.dto.ResponseDto;

@Service
public interface PointService {
	PointTypeCode getApiType();

	ResponseDto execute (PointDto requestDto);
}
