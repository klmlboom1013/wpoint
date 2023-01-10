package com.inicis.wpoint.domain.reward.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class RewardEntryEntityPk implements Serializable{
	private String rewardId;
	private Long srlno;
}
