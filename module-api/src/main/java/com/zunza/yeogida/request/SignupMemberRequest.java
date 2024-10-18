package com.zunza.yeogida.request;

import org.hibernate.validator.constraints.Length;

import com.zunza.yeogida.constant.MemberType;
import com.zunza.yeogida.dto.SignupMemberRequestDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignupMemberRequest {

	@Email(message = "유요한 이메일 형식이 아닙니다.")
	@NotBlank(message = "이메일을 입력해 주세요.")
	private String email;

	@NotBlank(message = "비밀번호를 입력해 주세요.")
	@Length(min = 8, max = 16, message = "비밀번호는 8자~16자로 설정해 주세요.")
	private String password;

	@NotBlank(message = "이름을 입력해주세요.")
	@Length(min = 2, max = 5, message = "이름은 2자~5자로 설정해 주세요. 5자 이상 일 경우 고객센터로 문의해 주세요.")
	private String name;

	@NotBlank(message = "핸드폰 번호를 입력해 주세요.")
	private String phone;

	@NotNull(message = "회원 유형을 선택해 주세요.")
	private MemberType memberType;

	public SignupMemberRequestDto toSignupMemberRequestDto() {
		return SignupMemberRequestDto.builder()
			.email(this.email)
			.password(this.password)
			.name(this.name)
			.phone(this.phone)
			.memberType(this.memberType)
			.build();
	}
}
