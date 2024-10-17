package com.zunza.yeogida.domain;

import com.zunza.yeogida.constant.AccommodationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Accommodation extends BaseEntity {

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String address;

	private String description;

	@Column(nullable = false)
	private AccommodationType accommodationType;

	@Column(nullable = false)
	private String contact;

	private Double rating;
}
