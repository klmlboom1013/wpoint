package com.inicis.wpoint.domain.user.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class UserEntityPk implements Serializable{
	private String wpointUserKey;
	private String wpayUserKey;
	private String siteId;
}
