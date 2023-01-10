package com.inicis.wpoint.domain.token.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicis.wpoint.domain.token.entity.TokenEntity;

public interface TokenRepository extends JpaRepository<TokenEntity, Long> {
	
}
