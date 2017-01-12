package com.team4.bigTower.member.controller;

import com.team4.bigTower.member.service.Member;

public interface MemberDao {
	public int memberInsert(Member member);
	public String memberLoginCheck(Member member);
}
