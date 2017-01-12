package com.team4.bigTower.board.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.bigTower.board.service.Board;

@Repository
public class BoardDaoImpl implements BoardDao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	private final String BOARD_NS="board.";
	@Override
	//글 전체수 쿼리문
	public int boardCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(BOARD_NS+"boardCountList");
	}
	//전체 글 불러오기 퀴리문
	@Override
	public List<Board> boardList(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(BOARD_NS+"boardList", map);
	}
	@Override
	public int boardAdd(Board board) {
		// TODO Auto-generated method stub
		return sqlSession.insert(BOARD_NS+"boardAdd", board);
	}
	
	 
}
