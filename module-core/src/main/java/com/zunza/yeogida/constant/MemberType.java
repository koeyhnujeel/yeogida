package com.zunza.yeogida.constant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MemberType {
	GUEST("게스트"),
	HOST("호스트");

	private String value;

	MemberType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@JsonCreator
	public MemberType form(String memberType) {
		for (MemberType type : MemberType.values()) {
			if (type.getValue().equals(memberType)) {
				return type;
			}
		}
		return null;
	}
}
