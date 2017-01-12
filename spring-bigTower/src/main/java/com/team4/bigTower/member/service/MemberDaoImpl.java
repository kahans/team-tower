package com.team4.bigTower.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String MEMBER_NS="member.";
	@Override
	//회원 등록 쿼리문 이동
	public int memberInsert(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.insert(MEMBER_NS+"memberAdd", member);
	}
	@Override
	//로그인 체크
	public String memberLoginCheck(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(MEMBER_NS+"memberLogin", member);
	}

}
