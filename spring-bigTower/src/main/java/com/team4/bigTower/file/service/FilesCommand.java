package com.team4.bigTower.file.service;

import org.springframework.web.multipart.MultipartFile;

public class FilesCommand {
	private String fileName;
	private String fileAuth;
	private MultipartFile multipartFile;
	
	
	public FilesCommand() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FileCommand [fileName=" + fileName + ", fileAuth=" + fileAuth + ", multipartFile=" + multipartFile + "]";
	}
	public String getfileName() {
		return fileName;
	}
	public void setfileName(String fileName) {
		this.fileName = fileName;
	}
	public String getfileAuth() {
		return fileAuth;
	}
	public void setfileAuth(String fileAuth) {
		this.fileAuth = fileAuth;
	}
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	
}
