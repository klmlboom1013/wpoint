package com.inicis.wpoint.domain.user.entity.jsonDataConts;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=false)
@Builder
@AllArgsConstructor
public class UserJsonDataConts {
	private final String version = "1.0";
	/** 본인인증 CI */
	@NotNull
	private String ci;
	/** 사용자 이름 */
	@NotNull
	private String userName;
	/** 생년월일 8자리 */
	@NotNull
	private String birthday;
	/** 휴대폰번호 */
	@NotNull
	private String phone;
	/** 성별 주민번호 뒤 첫 번째 자리 */
	@NotNull
	private String gender;
	/** WPOINT 서비스 가입 wtid */
	@NotNull
	private String wtid;
}
