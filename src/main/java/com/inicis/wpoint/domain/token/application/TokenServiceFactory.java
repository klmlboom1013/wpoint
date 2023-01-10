package com.inicis.wpoint.domain.token.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public final class TokenServiceFactory {
	
	private final Map<TokenServiceType, TokenService> services = new HashMap<>();

	/* Constructor */
	public TokenServiceFactory(List<TokenService> services){

		/* TokenService 구현체가 없으면 IllegalArgumentException으로 던진다. */
		if(CollectionUtils.isEmpty(services)) {
            throw new IllegalArgumentException("TokenService Implement class does not found.");
        }

		/* WpCardApiTypes을 Key로 WpCardService 구현체를 Map에 저장 한다. */
		for(TokenService service : services) {
			this.services.put(service.getApiType(), service);
		}
	}

	/**
	 * TokenServiceType에 해당하는 Service를 꺼내서 리턴 한다.
	 * @param wpLnkAcctApiType
	 * @return
	 */
	public TokenService getService(final TokenServiceType type) {
		return this.services.get(type);
	}
}
