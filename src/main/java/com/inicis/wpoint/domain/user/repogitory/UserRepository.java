package com.inicis.wpoint.domain.user.repogitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicis.wpoint.domain.user.entity.UserEntity;
import com.inicis.wpoint.domain.user.entity.UserEntityPk;

public interface UserRepository extends JpaRepository<UserEntity, UserEntityPk>{
	
}
