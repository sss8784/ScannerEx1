package operater;

import java.util.Scanner;

/*
 *  date: 2015.07.07
 *  Author : me
 *  @ story : 연산코드에 관한 문법
 */
public class OpCode {
	public static void main(String[] args) {
		/*
		 연산자(opcode)는 다음과 같이 분류된다.
		 1. 단항연산자 : ++, --, +. -
		 2. 이항 연잔자
		  (1) 산술연산자 : + , - , *, /(몫), %(나머지)
		  (2) 비교연산자 : < , > , <= , >=, !=(같지않다), ==(같다)
		  (3) 삼항연산자 : (....)? True : false
		  (4) 대입(할당)연산자 : = 
		 */
		//
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("초기값을 입력하세요");
		int a = scanner.nextInt(); // scanner로 입력한 값을 a에 할당함
		System.out.println("연산할 값을 입력하세요");
		int b = scanner.nextInt();
		System.out.println(a+b);

		
	}

}
