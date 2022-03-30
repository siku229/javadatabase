package t2_DBTest;

import java.util.Scanner;

public class DBTestRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// DB연동후 작업처리
		DBTest dbTest = new DBTest();
		
		System.out.println("DB 처리 작업 중..");
		
		// DB 검색작업
		System.out.print("찾고자하는 성명을 입력하세요. : ");
		String name = sc.next();
		dbTest.searchTest(name);
		
		System.out.println("DB 처리 작업 끝");

		// DB Close 처리
		dbTest.rsClose();
		dbTest.dbClose();
		sc.close();
	}
}
