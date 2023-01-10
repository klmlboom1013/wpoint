package com.inicis.wpoint.global.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = false)
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class ResponseDto {
	
	@NonNull
	private String resultCode;
	@NonNull
	private String resultMsg;
	@NonNull
	private String wtid;
	
	@Setter
	private Map<?,?> result;
}
