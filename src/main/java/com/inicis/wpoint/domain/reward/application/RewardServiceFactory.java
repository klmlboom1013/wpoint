package com.inicis.wpoint.domain.reward.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.inicis.wpoint.domain.reward.enums.RewardTypeCode;

@Component
public final class RewardServiceFactory {
	private final Map<RewardTypeCode, RewardService> services = new HashMap<>();

	/* Constructor */
	public RewardServiceFactory(List<RewardService> services){

		/* TokenService 구현체가 없으면 IllegalArgumentException으로 던진다. */
		if(CollectionUtils.isEmpty(services)) {
            throw new IllegalArgumentException("RewardService Implement class does not found.");
        }

		/* WpCardApiTypes을 Key로 WpCardService 구현체를 Map에 저장 한다. */
		for(RewardService service : services) {
			this.services.put(service.getApiType(), service);
		}
	}

	/**
	 * TokenServiceType에 해당하는 Service를 꺼내서 리턴 한다.
	 * @param type
	 * @return
	 */
	public RewardService getService(final RewardTypeCode type) {
		return this.services.get(type);
	}
}
