package com.inicis.wpoint.domain.token.entity.jsonDataConts;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper=false)
@Builder
@AllArgsConstructor
public class TokenJsonDataConts {
	private final String version = "1.0";
	/** Wpoint 충전  wpayToken 등록 wtid */
	@NotNull
	private String wtid;
	/** 결제수단 코드 */
	@NotNull
	private String payMethod;
	/** 원천사 결제토큰 */
	@NotNull
	private String payToken;
	/** 은행코드 */
	@NotNull
	private String bankCode;
	/** 은행 이름 */
	@NotNull
	private String bankName;
	/** 오픈뱅킹 가입 사용자ID */
	@NotNull
	private String openbankUserId;
}
