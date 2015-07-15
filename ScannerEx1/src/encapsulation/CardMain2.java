package encapsulation;

import java.security.GeneralSecurityException;
import java.util.Scanner;

public class CardMain2 {

	
	public static void main(String[] args) {
		/*
		 * 카드 두장을 비교해서 카드번호가 더 큰수가
		 * 이기는 게임 프로그램을 작성하시오.
		 * 일단, 프로토타입(시제품) 프로그램으로
		 * 개발자가 임의의 숫자를 입력하면
		 * 출력
		 * [홍길동 : 7] vs [김유신 : 3]
		 * 홍길동 승리
		 * 
		 */
		
		// 메인 메소드 안에 있어서 지변
		String name = "", name1="";
		int num = 0 , num1=0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("카드의 이름을 입력하세요");
		name = scanner.next();
		
		System.out.println("두번재카드의 이름을 입력하세요");
		name1 = scanner.next();
		
		
		// 객체를 생성함
		CardBean bean = new CardBean(name);
		// 스캐너가 받아 놓은 값은 현재 지변에 있다.
		// 그런데 연산 로직은 객체이 있다.
		// 따라서 지변에 있는 값을 멤변에 던져야한다.
		
				
		System.out.println(bean.toString());

		
		
	}

}
