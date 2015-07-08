package operater;

import java.util.Scanner;

public class Calculator {
	/*
	 * order
	 * 스캐너로 두값을 입력받아서
	 * 사칙연산 결과가 나오도록 하세요
	 * 
	 * 20+7 = 27
	 */

    public static void main(String[] args) {
    			// 연산에 쓸 재료들을 준비하는 선언부
    	int a = 0, b =0;
    		
        // 연산부
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		a = scanner.nextInt(); //next는 커서 다음 글자(숫자)를 변수 할당하라
		System.out.println("두번째 숫자를 입력하세요");
		b = scanner.nextInt();

		System.out.println(a+"+"+b+ "="+(a + b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}
}
