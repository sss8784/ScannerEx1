package operater;

import java.util.Scanner;

public class Calculator {
	/*
	 * order
	 * ��ĳ�ʷ� �ΰ��� �Է¹޾Ƽ�
	 * ��Ģ���� ����� �������� �ϼ���
	 * 
	 * 20+7 = 27
	 */

    public static void main(String[] args) {
    			// ���꿡 �� ������ �غ��ϴ� �����
    	int a = 0, b =0;
    		
        // �����
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		a = scanner.nextInt(); //next�� Ŀ�� ���� ����(����)�� ���� �Ҵ��϶�
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		b = scanner.nextInt();

		System.out.println(a+"+"+b+ "="+(a + b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}
}
