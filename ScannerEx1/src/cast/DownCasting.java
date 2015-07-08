package cast;
/*
 *  date: 2015.07.07
 *  Author : me
 *  @ story : 다운캐스팅문법
 */
public class DownCasting {
	public static void main(String[] args) {
		/*
		 DownCasting(다운캐스팅)
		 - 강제 형변환
		 - 프로그램에서 데이터 타입이 큰 변수(64bit)를
		 데이터 타입이 작은 변수(32비트)를
		 할당하려고 할때 명시적(int)으로 타입을 지정하는것
		 - 다만 데이터의 손실이 발생함
		 - 개발자는 직접 다운캐스팅을 하려고 하지말고 이클립스를 통해 자동으로 add cast한다.
		 */
		int a = 7;
		double d = 3.14D;
	   a = (int) d;
	   System.out.println("다운캐스팅 결과 "+a);
	}
	

}
