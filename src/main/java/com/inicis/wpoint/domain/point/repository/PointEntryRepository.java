package com.inicis.wpoint.domain.point.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicis.wpoint.domain.point.entity.PointEntryEntity;
import com.inicis.wpoint.domain.point.entity.PointEntryEntityPk;

public interface PointEntryRepository extends JpaRepository<PointEntryEntity, PointEntryEntityPk> {
	
}
