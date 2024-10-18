package com.zunza.yeogida.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zunza.yeogida.request.SignupMemberRequest;
import com.zunza.yeogida.service.MemberService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;

	@PostMapping("/api/members/signup")
	public ResponseEntity<Void> signupMember(@Valid @RequestBody SignupMemberRequest signupMemberRequest) {
		memberService.signupMember(signupMemberRequest.toSignupMemberRequestDto());
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
