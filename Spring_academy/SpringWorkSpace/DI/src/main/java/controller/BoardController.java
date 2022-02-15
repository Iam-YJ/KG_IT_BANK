package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BoardService;

@Controller
//������̼��� ���ؼ� �̰� ��Ʈ�ѷ����� �˷�����Ѵ� 
public class BoardController {
	
	private BoardService service;
	
	public BoardController() {
		System.out.println("-----BoradController ������ -----");
	}
	
	public void setService(BoardService service) {
		this.service = service;
	}
	
	//����ڰ� board/list.do�� ��û �ϸ� �ش� �޼ҵ尡 ����� �� �ֵ��� �Ϸ���
	//@requestMapping�� ���� �����ϸ� �ȴ� 
	
	@RequestMapping("/board/list.do")
	public String list(Model model) {
		
		//Model - servlet�� controller�� �߰� �Ű�ü ������ �ϴ� �������̼�
		//		- request ��ü�� ���ε�(����) ó���� �Ǿ� ���ΰ��� ȣȯ�� ���������� 
		
		List<String> list = service.selectList();
		
		//request.setAttribute �� �� �Ͱ� ���� 
		model.addAttribute("list",list);
		
		return "board_list";
	}

}
