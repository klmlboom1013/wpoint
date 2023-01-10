package com.inicis.wpoint.domain.point.entity;

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
@Table(name="WPOINT_USER_POINT_MSTR")
@IdClass(PointEntityPk.class)
public class PointEntity {
	
	@Id
	@Column(name="POINT_ID", length=100, unique=true)
	private String pointId;

	@Id
	@Column(name="WPOINT_USERID", length=100)
	private String wpointUserKey;	

	@Id
	@Column(name="WPOINT_TKN_VALUE", length=100)
	private String wpointToken;

	/** 포인트 충전 유형 코드 */
	@Column(name="POINT_TYPE_CD", length=100, nullable=false)
	private String pointTypeCode;

	/** 최초 충전 포인트 */
	@Column(name="CHRG_POINT", nullable=false)
	private Integer chargePoint;

	/** POINT 잔액 존재 유무 */
	@Setter
	@Column(name="BLNC_YN", length=1, nullable=false)
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

	/** 포인트 충전 WTID */
	@Column(name="WTID", length=9, nullable=false)
	private String wtid;

	@Setter
	@Lob
	private String jonDataConts;
	
	@Transient
	private Integer temp;
}
