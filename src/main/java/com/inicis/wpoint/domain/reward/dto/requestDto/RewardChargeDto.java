package com.inicis.wpoint.domain.reward.dto.requestDto;

import com.inicis.wpoint.domain.reward.dto.RewardDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString (callSuper = false)
@EqualsAndHashCode(callSuper = false)
public class RewardChargeDto extends RewardDto {
	
	private String wpointUserId;
	private String rewardEventId;
	private Integer chrgRewardAmt;
}
