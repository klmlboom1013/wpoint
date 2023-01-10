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
public class RewardEntryDeductData {
	private final String version = "1.0";
	private final String name = RewardTypeCode.RewardDeduct.name();
	
	private final List<InnerInterfacesDto> data = new LinkedList<>();

	public void addData(InnerInterfacesDto data){
		this.data.add(data);
	}

	/** 리워드 차감 정보 */
	@Getter
	@Builder
	@AllArgsConstructor
	@ToString
	public static class RewardDeductInfo implements InnerInterfacesDto{
		private String wptid; // 리워드 차감 wptid
		private String orgWptid; // 리워드 차감 발생 original wptid
		private String rewardDeductTypeCode; // 리워드 차감 타입(사유) : 선불서비스해지, 선불충전취소, 선불결제취소, 포인트 환불, 관리자 차감 등..
		private String totalRewardDeducAmount; // 총 차감될 리워드 금액.
		private String RewardEntryDeducAmount; // RewardEntry에서 차감된 금액.
	}
}
