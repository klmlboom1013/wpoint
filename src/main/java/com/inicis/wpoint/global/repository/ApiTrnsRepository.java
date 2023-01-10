package com.inicis.wpoint.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicis.wpoint.global.entity.ApiTrnsEntity;
import com.inicis.wpoint.global.entity.pk.ApiTrnsEntityPk;

public interface ApiTrnsRepository extends JpaRepository<ApiTrnsEntity, ApiTrnsEntityPk>{
	
}
