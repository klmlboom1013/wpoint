package com.inicis.wpoint.domain.reward.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@ToString
@Getter
@Entity
@Table(name="WPOINT_USER_REWARD_ENTRY_INFO")
@IdClass(RewardEntryEntityPk.class)
public class RewardEntryEntity {
	
	/** 리워드 ID */
	@Id
	@Column(name="REWARD_ID")
	private String rewardId;

	/** 리워드ID 사용 이력 순번 */
	@Id
	@Column(name="SRLNO")
	private Long srlno;

	/** WPOINT 사용자ID */
	@Column(name="WPOINT_USERID", length=100, nullable=false)
	private String wpointUserKey;	

	/** 리워드 유형 상세 코드 */
	@Column(name="REWARD_ENTRY_TYPE_CD", length=100, nullable=false)
	private String rewardEntryTypeCode;

	/** 충전(지급) 리워드 원금 */
	@Column(name="ORG_CHRG_REWARD", nullable=false)
	private Integer orgChargeReward;

	/** 리워드 차감 금액 */
	@Column(name="DDCT_REWARD", nullable=false)
	private Integer deductReward;

	/** 
	 * 이전 순번 리워드 잔액 
	 * 이전 순번이 없으면(srlno=0) : oldRewardAmount = orgChargeReward
	 */
	@Column(name="OLD_CRRT_REWARD", nullable=false)
	private Integer oldRewardAmount;

	/** 
	 * 리워드 차감, 차감취소가 계산된 현재 순번의 리워드 잔액 
	 * 리워드 차감 : currentReward = oldCurrentPoint - deductReward
	 */
	@Column(name="CRRT_REWARD", nullable=false)
	private Integer currentReward;

	@Column(name="REGI_DT", length=8, nullable=false)
	private String regiDt;
	
	@Column(name="REGI_TM", length=9, nullable=false)
	private String regiTm;

	/** 리워드 차감, 차감취소 wtid */
	@Column(name="WPTID", length=20, nullable=false)
	private String wptid;

	@Setter
	@Lob
	private String jsonDataConts;

	@Transient
	private Integer temp;
}
