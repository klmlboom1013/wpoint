package com.inicis.wpoint.domain.reward.enums;

/**
 * 리워드 차감 유형 코드
 */
public enum RewardDeductTypeCode {
	/** 관리자 포인트 차감 */
	DeductByAdmin,
	/** 리워드 결제 */
	RewardPayment,
	/** 리워드 이벤트 지급 취소 */
	RewardChargeEventRollback
	;
}
