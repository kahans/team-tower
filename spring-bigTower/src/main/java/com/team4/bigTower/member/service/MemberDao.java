package com.team4.bigTower.member.service;


public interface MemberDao {
	public int memberInsert(Member member);
	public String memberLoginCheck(Member member);
}
