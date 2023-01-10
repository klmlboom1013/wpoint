package com.inicis.wpoint.domain.point.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.inicis.wpoint.domain.point.enums.PointTypeCode;

@Component
public final class PointServiceFactory {
	private final Map<PointTypeCode, PointService> services = new HashMap<>();

	/* Constructor */
	public PointServiceFactory(List<PointService> services){

		/* TokenService 구현체가 없으면 IllegalArgumentException으로 던진다. */
		if(CollectionUtils.isEmpty(services)) {
            throw new IllegalArgumentException("PointService Implement class does not found.");
        }

		/* WpCardApiTypes을 Key로 WpCardService 구현체를 Map에 저장 한다. */
		for(PointService service : services) {
			this.services.put(service.getApiType(), service);
		}
	}

	/**
	 * TokenServiceType에 해당하는 Service를 꺼내서 리턴 한다.
	 * @param type
	 * @return
	 */
	public PointService getService(final PointTypeCode type) {
		return this.services.get(type);
	}
}
