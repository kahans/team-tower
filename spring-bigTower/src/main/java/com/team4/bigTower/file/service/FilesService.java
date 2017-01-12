package com.team4.bigTower.file.service;

import org.springframework.stereotype.Service;

@Service
public interface FilesService {
	public int fileAdd(FilesCommand fileCommand);
}
