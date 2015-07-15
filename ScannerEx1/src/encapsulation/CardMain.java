package encapsulation;

import java.security.GeneralSecurityException;
import java.util.Scanner;

public class CardMain {

	
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
		// 선언부 ==> 집에 있는 유저가 자기 모니터의 입력
		String name = "", name1="";
		int num = 0 , num1=0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("카드의 이름을 입력하세요");
		name = scanner.next();
		
		System.out.println("두번재카드의 이름을 입력하세요");
		name1 = scanner.next();
		
		//인터넷 망을 타고 데이터 값이 게임회사로 들어옴
		CardBean hong = new CardBean(name);
		CardBean kim = new CardBean(name1);
		
		CardGame game = new CardGame(hong,kim);
		
		// 사용자가 결과화면을 보여주는 중
		
		System.out.println(game.getWinner());
		

		
		
	}

}
