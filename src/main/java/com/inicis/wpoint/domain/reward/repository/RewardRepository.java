package com.inicis.wpoint.domain.reward.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicis.wpoint.domain.reward.entity.RewardEntity;
import com.inicis.wpoint.domain.reward.entity.RewardEntityPk;

public interface RewardRepository extends JpaRepository<RewardEntity, RewardEntityPk> {
	
}
