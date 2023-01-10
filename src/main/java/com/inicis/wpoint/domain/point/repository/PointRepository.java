package com.inicis.wpoint.domain.point.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicis.wpoint.domain.point.entity.PointEntity;
import com.inicis.wpoint.domain.point.entity.PointEntityPk;

public interface PointRepository extends JpaRepository<PointEntity, PointEntityPk> {
	
}
