package com.zunza.yeogida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zunza.yeogida.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
