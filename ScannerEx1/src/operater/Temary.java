package operater;
/*
 *  date: 2015.07.08
 *  Author : me
 *  @ story : 삼항연산자문법
 */
public class Temary {
	public static void main(String[] args) {
		int left = 1, right = 0, result = 0;
		boolean bool = true;
		/*
		 * 삼항연산자는 if-else의 축약문으로
		 * 조건식(bool)이 true이면 left값을 출력하고
		 * false이면 right값을 출력한다.
		 */
		result = bool ? left : right;
		System.out.println("참, 거짓 결과 : " +result);
		
	}

}
