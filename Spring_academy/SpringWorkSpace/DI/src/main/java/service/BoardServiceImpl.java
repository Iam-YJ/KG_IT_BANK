package service;

import java.util.List;

import dao.BoardDAO;

public class BoardServiceImpl implements BoardService {
	
	private BoardDAO dao;

	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public BoardServiceImpl(BoardDAO dao) {
		
		//외부에서 들어온 dao를 생성자 인젝션을 통해 주입할 예정...
		
		this.dao = dao;
	}
	
	
	public List selectList() { //데이터 처리를 해서 dao에 있는 메소드를 실행시킬 수 있는 역할
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	
	
}
