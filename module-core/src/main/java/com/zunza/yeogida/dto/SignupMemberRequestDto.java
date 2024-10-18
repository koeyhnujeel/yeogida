package com.zunza.yeogida.dto;

import com.zunza.yeogida.constant.MemberType;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SignupMemberRequestDto {
	private String email;
	private String password;
	private String name;
	private String phone;
	private MemberType memberType;

	@Builder
	public SignupMemberRequestDto(String email, String password, String name, String phone, MemberType memberType) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.memberType = memberType;
	}
}
