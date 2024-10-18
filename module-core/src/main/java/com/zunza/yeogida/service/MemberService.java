package com.zunza.yeogida.service;

import org.springframework.stereotype.Service;

import com.zunza.yeogida.domain.Member;
import com.zunza.yeogida.dto.SignupMemberRequestDto;
import com.zunza.yeogida.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	public void signupMember(SignupMemberRequestDto signupMemberRequestDto) {
		Member member = Member.from(signupMemberRequestDto);
		memberRepository.save(member);
	}
}
