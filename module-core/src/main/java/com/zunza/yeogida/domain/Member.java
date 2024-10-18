package com.zunza.yeogida.domain;

import com.zunza.yeogida.constant.MemberType;
import com.zunza.yeogida.dto.SignupMemberRequestDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {

	@Column(unique = true, nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String phone;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MemberType memberType;

	@Builder
	private Member(String email, String password, String name, String phone, MemberType memberType) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.memberType = memberType;
	}

	public static Member from(SignupMemberRequestDto signupMemberRequestDto) {
		return Member.builder()
			.email(signupMemberRequestDto.getEmail())
			.password(signupMemberRequestDto.getPassword())
			.name(signupMemberRequestDto.getName())
			.phone(signupMemberRequestDto.getPhone())
			.memberType(signupMemberRequestDto.getMemberType())
			.build();
	}
}
