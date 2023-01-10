package com.inicis.wpoint.domain.point.entity.jsonDataConts;

import java.util.LinkedList;
import java.util.List;

import com.inicis.wpoint.domain.point.enums.PointTypeCode;
import com.inicis.wpoint.global.dto.InnerInterfacesDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 포인트 차감 연관 데이터
 */
@Getter
@Builder
@NoArgsConstructor
@ToString
public class PointEntryDeductData {
	private final String version = "1.0";
	private final String name = PointTypeCode.PointDeduct.name();
	private final List<InnerInterfacesDto> data = new LinkedList<>();

	public void addData(InnerInterfacesDto data){
		this.data.add(data);
	}

	/** 포인트 차감 - 충전취소 */
	@Getter
	@Builder
	@AllArgsConstructor
	@ToString
	public static class PgPayApplCancelInfo implements InnerInterfacesDto {
		private String wtid; // 결제승인 WTID
		private String mid;
		private String siteId;
		private String wpayUserKey;
		private String wpayToken;
		private String orgTid; // 결제승인 TID
		private String tid; // 결제승인취소 TID
		private String applCancelPrice; // 결제승인취소금액
		private String applCancelDtm; // 결제승인취소 일자시간
		private String payRsltCd; // 결제승인취소결과코드
	}

	/** 관리자 포인트 차감 정보. */
	@Getter
	@Builder
	@AllArgsConstructor
	@ToString
	public static class BoAdminDeductInfo implements InnerInterfacesDto {
		private String wptid; // 관리자 포인트 회수 WPTID
		private String boAdminId; // 관리자 ID
	}
}
