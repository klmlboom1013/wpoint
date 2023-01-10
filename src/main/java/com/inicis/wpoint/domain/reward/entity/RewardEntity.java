package com.inicis.wpoint.domain.reward.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@Table(name="WPOINT_USER_REWARD_MSTR")
@IdClass(RewardEntityPk.class)
public class RewardEntity {
	
	/** 리워드ID */
	@Id
	@Column(name="REWARD_ID", length=100, unique = true)
	private String rewardId;

	/** WPOINT 사용자ID */
	@Id
	@Column(name="WPOINT_USERID", length=100)
	private String wpointUserKey;

	/** 리워드 충전(지급) 이벤트 ID */
	@Column(name="REWARD_EVENT_ID", length=100)
	private String rewardEventId;

	/** 리워드 충전(지급) 유형 코드 */
	@Column(name="REWARD_TYPE_CD", length=100, nullable=false)
	private String rewardTypeCode;

	/** 리워드 충전(지급) 원금 */
	@Column(name="CHRG_REWARD", nullable=false)
	private Integer chrgReward;

	/** REWARD 잔액 존재 유무 */
	@Setter
	@Column(name="BLANCE_YN", length=1, nullable=false)
	private String blanceYn;

	@Column(name="REGI_DT", length=8, nullable=false)
	private String regiDt;
	
	@Column(name="REGI_TM", length=9, nullable=false)
	private String regiTm;

	@Setter
	@Column(name="CHNG_DT", length=8)
	private String chngDt;

	@Setter
	@Column(name="CHNG_TM", length=9)
	private String chngTm;
	
	/** 리워드 충전(지급) wtid */
	@Column(name="WTID", length=20)
	private String wtid;

	@Setter
	@Id
	private String jsonDataConts;

	@Transient
	private Integer temp;
	
}