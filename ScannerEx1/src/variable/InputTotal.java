package variable;

import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		// �����, �ʱ�ȭ ����
		int kor, eng, meth; //�ν��Ͻ� ���������
		//�����, ���μ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���");
		 kor = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");
		 eng = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");
		 meth = scanner.nextInt();
		//total���������� ��������� �ʱ�ȭ��
		int total = kor + eng + meth;
		System.out.println("����"+total);
		int avg = total/3;
		// ����� ����
		System.out.println("��� "+avg);
	}

}
