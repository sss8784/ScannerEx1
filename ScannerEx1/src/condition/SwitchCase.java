package condition;

public class SwitchCase {
	public static void main(String[] args) {
		int flag = 3; //flag이란 변수느는 기존값이란 의미로 스위치 문에서 조건제어 변수로 많이 사용됨
		switch (flag) {
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		case 3: System.out.println("3"); break;
		default:System.out.println("1부터 3범위 밖의 숫자"); break;
		}
	}

}
