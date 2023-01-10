package com.inicis.wpoint.domain.user.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

/*
 * Wpoint User Service 등록 관리 Factory
 */
@Component
public final class UserServiceFactory {
	
	private final Map<UserServiceType, UserService> services = new HashMap<>();

	/* Constructor */
	public UserServiceFactory (List<UserService> services) {
		/* Wpoint UserService 구현체가 없으면 IllegalArgumentException으로 던진다. */
		if(CollectionUtils.isEmpty(services)) {
            throw new IllegalArgumentException("Wpoint User Service Implement class does not found.");
        }

		/* Wpoint UserApiTypes을 Key로 Wpoint UserService 구현체를 Map에 저장 한다. */
		for(UserService service : services) {
			this.services.put(service.getApiType(), service);
		}
	}

	/**
	 * Wpoint UserApiTypes에 해당하는 Wpoint UserService 구현체를 리턴한다.
	 * @param apiType
	 * @return
	 */
	public UserService getService(UserServiceType apiType) {
		return this.services.get(apiType);
	}
}
