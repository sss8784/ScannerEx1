package operater;

import java.util.Scanner;

/*
 *  date: 2015.07.07
 *  Author : me
 *  @ story : �����ڵ忡 ���� ����
 */
public class OpCode {
	public static void main(String[] args) {
		/*
		 ������(opcode)�� ������ ���� �з��ȴ�.
		 1. ���׿����� : ++, --, +. -
		 2. ���� ������
		  (1) ��������� : + , - , *, /(��), %(������)
		  (2) �񱳿����� : < , > , <= , >=, !=(�����ʴ�), ==(����)
		  (3) ���׿����� : (....)? True : false
		  (4) ����(�Ҵ�)������ : = 
		 */
		//
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ʱⰪ�� �Է��ϼ���");
		int a = scanner.nextInt(); // scanner�� �Է��� ���� a�� �Ҵ���
		System.out.println("������ ���� �Է��ϼ���");
		int b = scanner.nextInt();
		System.out.println(a+b);

		
	}

}
