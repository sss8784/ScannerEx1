package variable;

import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		// 선언부, 초기화 영역
		int kor, eng, meth; //인스턴스 변수선언법
		//연산부, 프로세싱
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		 kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		 eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		 meth = scanner.nextInt();
		//total지역변수를 연산식으로 초기화함
		int total = kor + eng + meth;
		System.out.println("총점"+total);
		int avg = total/3;
		// 결과값 리턴
		System.out.println("평균 "+avg);
	}

}
