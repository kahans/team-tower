package com.team4.bigTower.board.controller;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.bigTower.board.service.BoardService;


@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/boardList")
	public String boardList(Model model,
			@RequestParam(value="curretPage", defaultValue="1") int curretPage){
		logger.debug("board : ");
		Map<String, Object> mapList = boardService.boardList(curretPage);
		model.addAttribute("totalPage",mapList.get("totalPage"));
		model.addAttribute("lastPage",mapList.get("lastPage"));
		model.addAttribute("curretPage", curretPage);
		model.addAttribute("list", mapList.get("list"));
		
		return "/board/boardList";
	}
}
