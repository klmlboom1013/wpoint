package com.inicis.wpoint.domain.token.entity;

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
	name="WPOINT_USER_TKN_INFO",
	indexes = {
		@Index(name="idx_wpoint_user_tkn_info01", columnList="SITE_ID, WPAY_UERID, WPAY_TKN_VALUE")
	}
)
@IdClass(TokenEntityPk.class)
public class TokenEntity {

	@Id
	@Column(name="WPOINT_USERID", length=100, nullable=false)
	private String wpointUserKey;

	@Id
	@Column(name="WPOINT_TKN_VALUE", length=100, nullable=false)
	private String wpointToken;

	@Column(name="WPAY_UERID", length=100, nullable=false)
	private String wpayUserKey;

	@Column(name="WPAY_TKN_VALUE", length=100, nullable=false)
	private String wpayTknValue;

	@Column(name="SITE_ID", length=20, nullable=false)
	private String siteId;

	@Column(name="JNOFFC_ID", length=20, nullable=false)
	private String mid;

	@Setter
	@Column(name="USE_STATUS_CD", length=2, nullable=false)
	private String useStatusCd;

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
	
	@Setter
	@Lob
	private String jsonDataConts;

	@Transient
	private Integer temp;
}
