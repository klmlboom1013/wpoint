package com.inicis.wpoint.event.reward.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
public class RewardChargedEventDto {
	
	@NotNull
	private String wpointUserId;
	@NotNull
	private String rewardEventId;
	@NotNull
	private Integer chrgRewardAmt;
}
