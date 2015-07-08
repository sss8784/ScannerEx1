package datatype;
/*
 *  date: 2015.07.07
 *  Author : me
 *  @ stroy : String타입 문법
 */

public class StringDemon {
	public static void main(String[] args) {
		char c =  'd'; // 맨 끝에 있는 ;세미콜론이라고 하는데 구분자라고 한다.
		// 키 데이터타입의 c변수에 알파벳 c값을 할당함.
		System.out.println(c);
		String s = "abc";
		System.out.println(s+c);
		System.out.println("abcd");
		//알파벳 하나만 출력할 경우는 char타입을
		//사용하고, 하나이상 복수의 문자열을
		//출력할 때는 String타입을 사용한다.
		//주의할 점은 싱글워터와 더블워터를 유의.
		
	}

}
