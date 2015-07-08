package operater;

import java.util.Scanner;

/*
 *  date: 2015.07.08
 *  Author : me
 *  @ story : 이항연산자문법
 */
public class TimeSeperator {
	public static void main(String[] args) {
		/*
		 * 입력받은 초를 시간, 분, 초로 환산하는 프로그램
		 */
		
		//변수의 선언
		Scanner scanner = new Scanner(System.in);
		int input = 0, second=0 , minut = 0, hour=0;
		System.out.println("구하고자하는 (시간)초를 입력하세요");
		input = scanner.nextInt();
		//만약 입력받은 초가 500이라고 한다면 500초를 60으로 나눈 나머지가 초
		// 윗 연산에서 나온 몫을 다시 60으로 나눈 나머지가 분
		// 윗 연산에서 나온 몫이 시간
		
		second  = input % 60;
		minut = (input / 60) %60;
		hour = (input / 60) /60;
		
		System.out.println("입력하신 초는\t"+input+"\n"+hour+"시간"+minut+"분"+second+"초");
		
	}

}
