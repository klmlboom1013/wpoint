package com.inicis.wpoint.domain.token.application;

public enum TokenServiceType {
	
	/** Wpoint 연결 계좌 추가 */
	TokenAdd, 
	/** Wpoint 연결 계좌 삭제 */
	TokenRemove,
	/** Wpoint 연결 계좌 수정 */
	TokenModify,
	/** Wpoint 연결 계좌 조회 */
	TokenSearch,
	/** Wpoint 연결 계좌 리스트 조회 */
	TokenSearchList
	;
}
