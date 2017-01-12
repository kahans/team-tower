package com.team4.bigTower.file.controller;

import java.io.File;
import java.io.IOException;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.team4.bigTower.board.service.Board;
import com.team4.bigTower.file.service.FilesCommand;
import com.team4.bigTower.file.service.FilesService;
import com.team4.bigTower.file.service.Files;

public class FilesServiceImpl implements FilesService {

	private static final Logger logger = LoggerFactory.getLogger(FilesServiceImpl.class);
	@Override
	public int fileAdd(FilesCommand fileCommand) {
		String path="";
		String fileName="";
		File destFile =null;
		String extention ="";
		
		MultipartFile multipartFile = fileCommand.getMultipartFile();
		Files files = new Files();
		Board board = new Board();
		logger.info(fileCommand.toString());
		logger.debug(fileCommand.toString());
		try {
			//1 디렉토리 저장
			path = "D:\\leemyungchul\\eclipse02\\workspace_neon_sts\\spring-pds\\src\\main\\resources\\upload\\";
			//역 \때문에 오류가 발생한다. 이유는 검색을 해보고 해결하는 방법은 역슬러쉬 앞에나 뒤나 하나더 추가를 하자. \ -> \\
			UUID uuid = UUID.randomUUID();//랜덤아이디 부여
			fileName = uuid.toString().replace("-", "");//-문자 대신해서 공백으로 전환					
			//확장자를 구하고 표시?
			int index = multipartFile.getOriginalFilename().lastIndexOf(".");
			extention = multipartFile.getOriginalFilename().substring(index+1);
			fileName = fileName+"."+extention;
			destFile = new File(path+fileName);
			multipartFile.transferTo(destFile);
			
			//2 FileBoardCommand -> fileBoard -> DAO 
			//Files files = new Files();
			files.setfTitle(fileCommand.getfileName());
			files.setfAuth(fileCommand.getfileAuth());
			files.setfPath(path);
			files.setfName(fileName);
			files.setbNo(board.getbNo());
			//files.setExtention(extention);
			
			
			logger.info("{} : ", files.toString());
			logger.debug("{} : ", files.toString());
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			destFile.delete();
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			destFile.delete();
			e.printStackTrace();
		}	
		
		return 0;
	}

}
