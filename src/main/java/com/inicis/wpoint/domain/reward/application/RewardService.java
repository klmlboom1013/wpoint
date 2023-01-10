package com.inicis.wpoint.domain.reward.application;

import org.springframework.stereotype.Service;

import com.inicis.wpoint.domain.reward.dto.RewardDto;
import com.inicis.wpoint.domain.reward.enums.RewardTypeCode;
import com.inicis.wpoint.global.dto.ResponseDto;

@Service
public interface RewardService {
	RewardTypeCode getApiType();

	ResponseDto execute (RewardDto requestDto);
}
