package com.inicis.wpoint.global.entity.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ApiTrnsEntityPk implements Serializable {
	private String wtid;
	private String dupDvdValue;
	private String regiDt;
}
