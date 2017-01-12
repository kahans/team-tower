package com.team4.bigTower.file.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.bigTower.file.service.FilesCommand;
import com.team4.bigTower.file.service.FilesService;

@Controller
public class FilesController {
	private static final Logger logger = LoggerFactory.getLogger(FilesController.class);
	@Autowired
	private FilesService fileService;
	@RequestMapping(value="/fileUpload", method=RequestMethod.GET)
	public String FileUpload(){
		
		return "/file/fileUpload";		
	}
	@RequestMapping(value="/fileUpload", method=RequestMethod.POST)
	public String FileUpload(FilesCommand fileCommand){
		logger.debug(fileCommand.toString());
		
		fileService.fileAdd(fileCommand);
		
		return "redirect:/";		
	}
}
