package com.team4.bigTower.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
/*	요구사항 끝나면 설계 다음주 수요일
	설계할때 하드웨어 까지 하다면 계획안에 들어가고 그때 애기를 하신다.
	구현은 화면을 그려보고 파워포인트로 150장 정도 나오면 뷰화면은 거의 나온다.
	요구사항을 작성하고 나서 피드백을 해주신다.
	실무에서도 사용하는 문서 작성 방법 문서 만드는거 진행하는거 
	레이션 외래키가 하나 이상을 연결 되어 있어야 한다.
	개개인별 문서작성
	*/
	@Autowired//new를 작성을 안해도 autowired로 통해서 객체를 의존성을 부여하여 
	private MemberDao memberDao;
	
	@Override
	public int memberAdd(Member member) {
		// TODO Auto-generated method stub
		return memberDao.memberInsert(member);
	}

	@Override
	public String memberLogin(Member member) {
		// TODO Auto-generated method stub
		
		
		
		return memberDao.memberLoginCheck(member);
	}

}
