package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.DeptVO;

@Repository("dept_dao")//���� ������Ʈ�� �ٸ� ��Ű����  DeptDAO��� �̸��� Ŭ������ ���� ��츦 ����� ������ ���κκ�,,
public class DeptDAO {

	//Auto-Decting����� ����Ҷ��� �������� ����Ҽ� �����Ƿ�...
	//SqlSession��ü�� Autowired����� �̿��Ͽ� �������� ���ָ� �ȴ�.....
	@Autowired
	private SqlSession sqlSession;
	
	public DeptDAO() {
		System.out.println("--DeptDAO ������");
	}
	
	public List<DeptVO> selectList(){
		List<DeptVO> list = null;
		
		list = sqlSession.selectList("dept.dept_list");
		
		return list;
	}
	
}
