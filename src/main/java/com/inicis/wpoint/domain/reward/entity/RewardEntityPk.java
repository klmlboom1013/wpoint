package com.inicis.wpoint.domain.reward.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class RewardEntityPk implements Serializable {
	private String rewardId;
	private String wpointUserKey;
}
