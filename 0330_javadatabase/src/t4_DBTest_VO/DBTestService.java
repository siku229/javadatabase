package t4_DBTest_VO;

import java.util.ArrayList;
import java.util.Scanner;

public class DBTestService {
	Scanner sc = new Scanner(System.in);
	DBTestDAO dao = new DBTestDAO();
	DBTestVO vo = new DBTestVO();
	String name;
	
	// 자료 등록//dsa dasdasd
	public void input() {
		System.out.println("성명 : ");
		vo.setName(sc.next());
		System.out.println("나이 : ");
		vo.setAge(sc.nextInt());
		System.out.println("성별 : ");
		vo.setGender(sc.next());
		System.out.println("입사일 : ");
		vo.setJoinday(sc.next());
		dao.input(vo);
	}

	// 개별 자료 검색
	public void search() {
		System.out.print("조회하실 성명을 입력하세요. : ");
		name = sc.next();
		vo = dao.search(name);
		
		if(vo.getName() == null) {
			System.out.println(name + "을(를) 찾을 수 없습니다.");
		} else {
			System.out.println("===============================");
			System.out.println("번호\t성명\t나이\t성별\t가입일자");
			System.out.println("-------------------------------");
			System.out.println(vo.getIdx() + "\t" + vo.getName() + "\t" + vo.getAge() + "\t" + vo.getGender() + "\t" + vo.getJoinday().substring(0, 10));			
		}
	}

	// 전체 자료 검색 후 출력 처리
	public void list() {
		ArrayList<DBTestVO> vos = dao.list();
		// 전체 자료 출력 처리 하는 곳
		System.out.println("===============================");
		System.out.println("번호\t성명\t나이\t성별\t가입일자");
		System.out.println("-------------------------------");
		for(int i = 0; i < vos.size(); i++) {
			vo = vos.get(i);
			System.out.println(vo.getIdx() + "\t" + vo.getName() + "\t" + vo.getAge() + "\t" + vo.getGender() + "\t" + vo.getJoinday());
		}
	}

	// 자료 수정
	public void update() {
		// TODO Auto-generated method stub
		
	}

	// 자료 삭제
	public void delete() {
		System.out.print("삭제할 성명을 입력하세요. : ");
		name = sc.next();
		int res = dao.delete(name);
		if(res == 1) {
			System.out.println("자료가 삭제되었습니다.");
		} else {
			System.out.println("자료를 삭제하지 못했습니다.");
		}
	}
}
