package com.inicis.wpoint.domain.reward.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicis.wpoint.domain.reward.entity.RewardEntryEntity;
import com.inicis.wpoint.domain.reward.entity.RewardEntryEntityPk;

public interface RewardEntryRepository extends JpaRepository<RewardEntryEntity, RewardEntryEntityPk> {
	
}
