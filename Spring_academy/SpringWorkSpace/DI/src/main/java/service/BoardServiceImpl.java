package service;

import java.util.List;

import dao.BoardDAO;

public class BoardServiceImpl implements BoardService {
	
	private BoardDAO dao;

	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public BoardServiceImpl(BoardDAO dao) {
		
		//�ܺο��� ���� dao�� ������ �������� ���� ������ ����...
		
		this.dao = dao;
	}
	
	
	public List selectList() { //������ ó���� �ؼ� dao�� �ִ� �޼ҵ带 �����ų �� �ִ� ����
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	
	
}
