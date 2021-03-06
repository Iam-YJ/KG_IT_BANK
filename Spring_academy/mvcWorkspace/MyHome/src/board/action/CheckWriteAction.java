package board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import board.boardDAO.BoardDAO;
import board.boardDTO.BoardDTO;
import util.Action;

public class CheckWriteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDTO dto = new BoardDTO();
		
		//MultipartRequest 객체 생성.,..
		
		String realPath = request.getServletContext().getRealPath("/Storage");
		
		MultipartRequest mr = new MultipartRequest(request, realPath,1024*1024*10,"UTF-8",
				new DefaultFileRenamePolicy());
				
		//1. request
		//2. 서버에 저장할 파일 경로...단 실제 경로를 적어야 한다..
		//3. 파일의 크기 - byte단위로 작성...
		//4. 인코딩형식
		//5. 덮어쓰기 방지 설정 클래스... - 선택사항
		
		dto.setId(mr.getParameter("id"));
		dto.setTitle(mr.getParameter("title"));
		dto.setContent(mr.getParameter("content"));
		
		//파일은 getParameter를 통해 받을수 없다..
		
		//mr.getFilesystemName(arg0) - 저장된 파일명
		//mr.getOriginalFileName(arg0) - 전송된 파일명
		
		String file1 = mr.getOriginalFileName("filename");
		String file2 = mr.getFilesystemName("filename");
		String file3 = mr.getParameter("filename");
		
		System.out.println(file1 + "\t" + file2 + "\t" + file3);
		
		dto.setFilename(file2);
		
		boolean check = BoardDAO.getInstance().write(dto);
		
		request.setAttribute("check", check);
		request.setAttribute("status", "write");
		request.setAttribute("url", "/MyHome/BoardList.brd");
		
	}
	
}






















