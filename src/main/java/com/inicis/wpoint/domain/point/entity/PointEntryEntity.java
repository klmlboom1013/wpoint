package com.inicis.wpoint.domain.point.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
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
@Table(
	name="WPOINT_USER_POINT_ENTRY_INFO",
	indexes = {
		@Index(name="idx_wpoint_user_point_entry_info01", columnList = "WPOINT_USERID, POINT_ID"),
		@Index(name="idx_wpoint_user_point_entry_info02", columnList = "REGI_DT, WPOINT_USERID")
	}
)
@IdClass(PointEntryEntityPk.class)
public class PointEntryEntity {
	
	/** 포인트ID */
	@Id
	@Column(name="POINT_ID")
	private String pointId;

	/** 포인트ID 사용 이력 순번 */
	@Id
	@Column(name="SRLNO")
	private Long srlno;

	@Column(name="WPOINT_USERID", length=100, nullable=false)
	private String wpointUserKey;	

	@Column(name="WPOINT_TKN_VALUE", length=100, nullable=false)
	private String wpointToken;

	/** 포인트 유형 상세 코드 */
	@Column(name="POINT_ENTRY_TYPE_CD", length=100, nullable=false)
	private String pointEntryTypeCode;	

	/** 충전 포인트 원금 */
	@Column(name="ORG_CHRG_POINT", nullable=false)
	private Integer orgChargePoint;

	/** 포인트 차감 금액 */
	@Column(name="DDCT_POINT", nullable=false)
	private Integer deductPoint;

	/** 
	 * 이전 순번 포인트 잔액 
	 * 이전 순번이 없으면(srlno=0) : oldCurrentPoint = orgChargePoint
	 */
	@Column(name="OLD_CRRT_POINT", nullable=false)
	private Integer oldCurrentPoint;

	/** 
	 * 포인트 차감, 차감취소가 계산된 현재 순번의 포인트 잔액 
	 * 포인트 차감 : currentPoint = oldCurrentPoint - deductPoint
	 */
	@Column(name="CRRT_POINT", nullable=false)
	private Integer currentPoint;

	/** 포인트 충전, 차감 시 지급되는 리워드 이벤트 ID */
	@Setter
	@Column(name="REWARD_EVENT_ID", length=100)
	private String rewardEventId;

	@Column(name="REGI_DT", length=8, nullable=false)
	private String regiDt;
	
	@Column(name="REGI_TM", length=9, nullable=false)
	private String regiTm;

	/** 포인트 차감, 차감취소 wtid */
	@Column(name="WTID", length=20, nullable=false)
	private String wtid;
	
	@Setter
	@Lob
	private String jsonDataConts;

	@Transient
	private Integer temp;
}
