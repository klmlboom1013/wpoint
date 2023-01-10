package com.inicis.wpoint.domain.token.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Embeddable
public class TokenEntityPk implements Serializable {
	@NotNull
	private String wpointUserKey;
	@NotNull
	private String wpointToken;
}
