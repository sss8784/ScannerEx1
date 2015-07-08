package escape;

import java.util.Scanner;

/*
 *  date: 2015.07.07
 *  Author : me
 *  @ story : 다운캐스팅문법
 */
public class ExcapeDemo {
	public static void main(String[] args) {
		/*
		 * 문제.
		 * 홍길동씨는 30세이고, 김유신씨는 25세입니다.
		 * 홍길동씨와 김유신씨의 나이차이를 출력하는데,
		 * "홍길동씨는 김유신씨보다 5세가 많습니다."
		 */	
		

		int hongage = 0, kimage = 0 , age = 0;
		String hong = "", Kim = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		hong = scanner.next();
		System.out.println("이름을 입력하세요");
		Kim = scanner.next();
		System.out.println("홍길동씨의 나이를 입력하세요");
		hongage = scanner.nextInt();
		System.out.println("김유신씨의 나이를 입력하세요");
		kimage = scanner.nextInt();
		age = hongage - kimage;

		System.out.println(hong+"씨는\t"+Kim+"씨보다,\t"+age+"세가 많습니다.");
		
		/*
		 escape문자 (\t, \n) 처럼 알파벳에 \를 첨부하여
		 특수한 기능을 나타내도록 한 문법,
		 많이 있지만 \t, \n 만 아셔도 무방합니다.
		 
		 */

		
	}

}
