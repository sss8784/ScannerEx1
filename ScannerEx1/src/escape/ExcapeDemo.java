package escape;

import java.util.Scanner;

/*
 *  date: 2015.07.07
 *  Author : me
 *  @ story : �ٿ�ĳ���ù���
 */
public class ExcapeDemo {
	public static void main(String[] args) {
		/*
		 * ����.
		 * ȫ�浿���� 30���̰�, �����ž��� 25���Դϴ�.
		 * ȫ�浿���� �����ž��� �������̸� ����ϴµ�,
		 * "ȫ�浿���� �����ž����� 5���� �����ϴ�."
		 */	
		

		int hongage = 0, kimage = 0 , age = 0;
		String hong = "", Kim = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		hong = scanner.next();
		System.out.println("�̸��� �Է��ϼ���");
		Kim = scanner.next();
		System.out.println("ȫ�浿���� ���̸� �Է��ϼ���");
		hongage = scanner.nextInt();
		System.out.println("�����ž��� ���̸� �Է��ϼ���");
		kimage = scanner.nextInt();
		age = hongage - kimage;

		System.out.println(hong+"����\t"+Kim+"������,\t"+age+"���� �����ϴ�.");
		
		/*
		 escape���� (\t, \n) ó�� ���ĺ��� \�� ÷���Ͽ�
		 Ư���� ����� ��Ÿ������ �� ����,
		 ���� ������ \t, \n �� �Ƽŵ� �����մϴ�.
		 
		 */

		
	}

}
