package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BoardService;

@Controller
//어노테이션을 통해서 이게 컨트롤러임을 알려줘야한다 
public class BoardController {
	
	private BoardService service;
	
	public BoardController() {
		System.out.println("-----BoradController 생성자 -----");
	}
	
	public void setService(BoardService service) {
		this.service = service;
	}
	
	//사용자가 board/list.do를 요청 하면 해당 메소드가 실행될 수 있도록 하려면
	//@requestMapping을 통해 지정하면 된다 
	
	@RequestMapping("/board/list.do")
	public String list() {
		List<String> list = service.selectList();
		
		return "board_list";
	}

}
