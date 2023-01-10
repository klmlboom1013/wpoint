package com.inicis.wpoint.global.dto;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class ApplicationProcDto {
	
	private RequestDto requestDto;
	
	private final List<?> processDataList = new LinkedList<>();

	private final Map<?,?> processDatas = new HashMap<>();
}
