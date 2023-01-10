package com.inicis.wpoint.domain.point.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class PointEntityPk implements Serializable {
	private String pointId;
	private String wpointUserKey;	
	private String wpointToken;
}
