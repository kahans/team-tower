package com.team4.bigTower.board.controller;

import java.util.List;
import java.util.Map;

import com.team4.bigTower.board.service.Board;

public interface BoardDao {
	//글 갯수
	public int boardCount();
	//글 목록
	public List<Board> boardList(Map<String, Integer> map);
	public int boardAdd(Board board);
}
