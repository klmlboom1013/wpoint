package com.inicis.wpoint.event.reward.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.inicis.wpoint.domain.reward.application.RewardServiceFactory;
import com.inicis.wpoint.domain.reward.dto.requestDto.RewardChargeDto;
import com.inicis.wpoint.domain.reward.enums.RewardTypeCode;
import com.inicis.wpoint.event.reward.dto.RewardChargedEventDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class RewardEventHandler {
	
	private final RewardServiceFactory rewardServiceFactory;
	
	@Async
	@EventListener
	public void rewardCharge(RewardChargedEventDto eventDto) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.rewardServiceFactory.getService(RewardTypeCode.RewardCharge)
			.execute(
				RewardChargeDto.builder()
					.rewardEventId(eventDto.getRewardEventId())
					.wpointUserId(eventDto.getWpointUserId())
					.chrgRewardAmt(eventDto.getChrgRewardAmt())
					.build());
	}
}
