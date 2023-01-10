package com.inicis.wpoint.domain.reward.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inicis.wpoint.domain.reward.application.RewardServiceFactory;
import com.inicis.wpoint.domain.reward.dto.RewardDto;
import com.inicis.wpoint.domain.reward.enums.RewardTypeCode;
import com.inicis.wpoint.global.dto.ResponseDto;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*", exposedHeaders = { "Content-Disposition" }, maxAge = 3600)
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/wpoint")
public class RewardController { 
	
	private final RewardServiceFactory rewardServiceFactory;

	@PostMapping(value="/reward-charge/{wpointUserKey}/{signature}")
	public ResponseDto charge (@PathVariable String wpointUserKey, @PathVariable String signature, RewardDto requestDto) {
		return this.rewardServiceFactory.getService(RewardTypeCode.RewardCharge).execute(requestDto);
	}

	@PostMapping(value="/reward-deduct/{wpointUserKey}/{signature}")
	public ResponseDto deduct (@PathVariable String wpointUserKey, @PathVariable String signature, RewardDto requestDto) {
		return this.rewardServiceFactory.getService(RewardTypeCode.RewardDeduct).execute(requestDto);
	}

}
