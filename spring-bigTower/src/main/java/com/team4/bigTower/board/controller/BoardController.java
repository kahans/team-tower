package com.team4.bigTower.board.controller;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.bigTower.board.service.Board;
import com.team4.bigTower.board.service.BoardService;
import com.team4.bigTower.file.service.FilesCommand;
import com.team4.bigTower.file.service.FilesService;


@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	@Autowired
	private FilesService fileService;
	
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
	@RequestMapping(value="/boardAdd", method=RequestMethod.GET)
	public String boardAdd(){
		return "/board/boardAdd";
	}
	@RequestMapping(value="/boardAdd", method=RequestMethod.POST)
	public String boardAdd(Board board, FilesCommand filesCommand){
		//boardService로 보내서 file 까지 테이블에  저장하게 한다.
		logger.debug("dedug : ", filesCommand);
		boardService.boardAdd(board);
		fileService.fileAdd(filesCommand);
		
		return "redirect:/boardList";
		
		
	}
}
