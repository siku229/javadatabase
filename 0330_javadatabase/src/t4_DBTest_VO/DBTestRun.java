package t4_DBTest_VO;

import java.util.Scanner;

public class DBTestRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DBTestService service = new DBTestService();
		
		// 메뉴 생성
		int sel;
		boolean run = true;
		while(run) {
			System.out.println("____ 작업선택 ____");
			System.out.print("1.자료입력 2.개별조회 3.전체조회 4.수정 5.삭제 6.종료 ==>> ");
			sel = sc.nextInt();
			switch(sel) {
				case 1:
					service.input();
					break;
					
				case 2:
					service.search();				
					break;
					
				case 3:
					service.list();
					break;
					
				case 4:
					service.update();
					break;
					
				case 5:
					service.delete();
					break;
					
				default:
					run = false;
			}
		}
		System.out.println("작업끝");
		sc.close();
	}
}
