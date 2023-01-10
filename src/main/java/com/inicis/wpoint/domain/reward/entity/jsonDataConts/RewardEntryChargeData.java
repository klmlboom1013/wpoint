package com.inicis.wpoint.domain.reward.entity.jsonDataConts;

import java.util.LinkedList;
import java.util.List;

import com.inicis.wpoint.domain.reward.enums.RewardTypeCode;
import com.inicis.wpoint.global.dto.InnerInterfacesDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RewardEntryChargeData {
	private final String version = "1.0";
	private final String name = RewardTypeCode.RewardCharge.name();
	
	private final List<InnerInterfacesDto> data = new LinkedList<>();

	public void addData(InnerInterfacesDto data){
		this.data.add(data);
	}

	/** 포인트 충전 결제 승인 정보 */
	@Getter
	@Builder
	@AllArgsConstructor
	@ToString
	public static class RewardChargeEventInfo implements InnerInterfacesDto{
		private String wtid; // 리워드 차감 wptid
		private String rewardEventId; // 리워드 이벤트 ID
		private String rewardEventTypeCode; // 리워드 이벤트 타입 코드
		private String rewardCharge; // 리워드 이벤트 금액
	}
}
