package com.inicis.wpoint.domain.point.entity.jsonDataConts;

import java.util.LinkedList;
import java.util.List;

import com.inicis.wpoint.domain.point.enums.PointTypeCode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * 포인트 지급(충전) 연관 데이터
 */
@Getter
@Builder
@AllArgsConstructor
@ToString
public class PointEntryChargeData {
	private final String version = "1.0";
	private final String name = PointTypeCode.PointCharge.name();
	private final List<InnerEmptyIntf> data = new LinkedList<>();

	public void addData(InnerEmptyIntf data){
		this.data.add(data);
	}
	
	/** 포인트 충전 결제 승인 정보 */
	@Getter
	@Builder
	@AllArgsConstructor
	@ToString
	public static class PgPayApplInfo implements InnerEmptyIntf{
		private String wtid; // 결제승인 WTID
		private String mid;
		private String siteId;
		private String wpayUserKey;
		private String wpayToken;
		private String tid; // 결제승인 TID
		private String applPrice; // 결제승인금액
		private String applDtm; // 결제승인 일자시간
		private String payRsltCd; // 결제승인결과코드
	}

	/** 관리자 포인트 충전 정보 */
	@Getter
	@Builder
	@AllArgsConstructor
	@ToString
	public static class BoAdminChargeInfo implements InnerEmptyIntf{
		private String wptid; // 관리자 포인트 충전 WPTID
		private String boAdminId;
	}
	
	/** Inner Class Interface */
	private static interface InnerEmptyIntf { }
}
