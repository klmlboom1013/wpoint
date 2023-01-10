package com.inicis.wpoint.domain.point.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inicis.wpoint.domain.point.application.PointServiceFactory;
import com.inicis.wpoint.domain.point.dto.PointDto;
import com.inicis.wpoint.domain.point.enums.PointTypeCode;
import com.inicis.wpoint.global.dto.ResponseDto;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*", exposedHeaders = { "Content-Disposition" }, maxAge = 3600)
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/wpoint")
public class PointController {
	
	private final PointServiceFactory pointServiceFactory;

	@PostMapping(value="/point-charge/{wpointUserKey}/{signature}")
	public ResponseDto charge (@PathVariable String wpointUserKey, @PathVariable String signature, PointDto requestDto) {
		return this.pointServiceFactory.getService(PointTypeCode.PointCharge).execute(requestDto);
	}

	@PostMapping(value="/point-deduct/{wpointUserKey}/{signature}")
	public ResponseDto refund (@PathVariable String wpointUserKey, @PathVariable String signature, PointDto requestDto) {
		return this.pointServiceFactory.getService(PointTypeCode.PointDeduct).execute(requestDto);
	}
	
}
