package JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) throws SQLException {
		//DBConnection conn = new DBConnection();
		//DB에 접속하기 위한 객체
		//conn.DBconnect();
		//SQL문을 사용하기 위한 객체
		
		CRUD crud=new CRUD();
		//crud.insert();
		
		//crud.insert();
		//crud.select();
		//crud.update();
		crud.delete();
		
		
		System.out.println("=====================================");
		System.out.println("               네이버 회원 가입           ");
		
		boolean run =true;
			
		while(run) {
		System.out.println("=====================================");
		System.out.println("1.가입    2.조회     3.수정     4.삭제   5.종료 ");
		System.out.println();
		System.out.println("선택>>");
		Scanner sc =new Scanner(System.in);
		int menu = sc.nextInt();
			switch(menu) {
			case 1:
				crud.insert();
				break;
			case 2:
				crud.select();
				break;
			case 3:
				crud.update();
				break;
			case 4:
				crud.delete();
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료!");
				break;
			default:
				System.out.println("다시 입력해 주세요!");
				break;
			
			}
	}
	
	}}
