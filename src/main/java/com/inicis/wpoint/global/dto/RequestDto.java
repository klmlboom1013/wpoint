package com.inicis.wpoint.global.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class RequestDto {
	
	protected String site;
	protected String siteId;
	protected String mid;
	protected String wpayUserKey;
	protected String signature;
}
