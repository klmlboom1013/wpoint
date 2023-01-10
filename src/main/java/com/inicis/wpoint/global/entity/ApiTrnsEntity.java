package com.inicis.wpoint.global.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.inicis.wpoint.global.entity.pk.ApiTrnsEntityPk;

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
@Table(name="WPOINT_API_TRNS")
@IdClass(ApiTrnsEntityPk.class)
public class ApiTrnsEntity {
	
	@Id
	@Column(name = "WTID", length = 20)
	private String wtid;

	/** 중복 구분 값 */
	@Id
	@Column(name = "DUP_DVD_VALUE", length = 100)
	private String dupDvdValue;

	/** 센터 구분 코드 */
	@Column(name = "IDC_DVD_CD", length = 2, nullable = false)
	private String idcDvdCode;

	/** 서버명 */
	@Column(name = "SVR_NM", length = 20, nullable = false)
	private String serverName;

	/** 업무구분코드 */
	@Column(name = "JOB_DVD_CD", length = 2, nullable = false)
	private String jobDvdCode;

	/** WPOINT 사용자ID */
	@Column(name = "WPOINT_USERID", length = 100)
	private String wpointUserKey;

	/** 가맹점 사이트 */
	@Column(name = "SITE_NM", length = 20, nullable = false)
	private String siteNm;

	/** 가맹점 그룹ID */
	@Column(name = "SITE_ID", length = 20, nullable = false)
	private String siteId;

	/** 가맹점ID */
	@Column(name = "JNOFFC_ID", length = 20, nullable = false)
	private String mid;

	/** 원거래 WTID */
	@Column(name = "ORG_WTID", length = 20, nullable = false)
	private String orgWtid;

	@Id
	@Column(name = "REGI_DT", length = 8, nullable = false)
	private String regiDt;

	@Column(name = "REGI_TM", length = 9, nullable = false)
	private String regiTm;

	@Setter
	@Column(name = "CHNG_DT", length = 8)
	private String chngDt;

	@Setter
	@Column(name = "CHNG_TM", length = 9)
	private String chngTm;

	/** 요청 전문 JSON */
	@Column(name = "REQ_GRM_DATA_VALUE", length = 4000, nullable = false)
	private String reqGrmDataValue;

	/** 응답 전문 JSON */
	@Setter
	@Column(name = "RSPS_GRM_DATA_VALUE", length = 4000)
	private String rspsGrmDataValue;
}
