package com.inicis.wpoint.domain.user.entity;

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
@Table(name="WPOINT_USER_INFO")
@IdClass(UserEntityPk.class)
public class UserEntity {
	
	@Id
	@Column(name="WPOINT_USERID", length=100, nullable=false, unique=true)
	private String wpointUserKey;

	@Id
	@Column(name="WPAY_USERID", length=100, nullable=false)
	private String wpayUserKey;
	
	@Id
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
