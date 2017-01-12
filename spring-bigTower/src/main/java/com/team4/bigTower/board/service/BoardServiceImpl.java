package com.team4.bigTower.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public Map<String, Object> boardList(int curretPage) {
		// TODO Auto-generated method stub
		//글 전체갯수 갖어 온다.
		int totalPage = boardDao.boardCount();
		//beginPage, perPage, totalPage, lastPage
		//한페이지에 불러올수 있는 글 수 제한
		int perPage=10;
		//한페이지에 처음 글부터 보기
		int beginPage = (curretPage-1)*perPage;
		//여러페이지를 나누는 계산식
		int lastPage = totalPage / perPage;
		if(totalPage % perPage !=0){
			lastPage++;
		}
		//Map<String, Integer>인터페이스에 map라는 변수를 선언하고 HashMap<String, Integer>의 객체를 만드고 map변수에 대입한다.
		Map<String,Integer> map = new HashMap<String, Integer>();
				//"Key", value 를 입력을 한다.

		map.put("beginPage", beginPage);
		map.put("perPage", perPage);
		//변수 map에 담겨져 있는 key, value을 boardList 메서드로 입력하고 실행을 하게 되고
		//실해되어 나온 값들이 List<Board> list 변수에 담겨진다.
		List<Board> list = boardDao.boardList(map);
		
		Map<String, Object> mapList = new HashMap<String, Object>();
		mapList.put("totalPage", totalPage);
		mapList.put("lastPage", lastPage);
		mapList.put("list", list);
		
		
		return mapList;
	}

}
