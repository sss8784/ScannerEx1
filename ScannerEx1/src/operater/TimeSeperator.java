package operater;

import java.util.Scanner;

/*
 *  date: 2015.07.08
 *  Author : me
 *  @ story : ���׿����ڹ���
 */
public class TimeSeperator {
	public static void main(String[] args) {
		/*
		 * �Է¹��� �ʸ� �ð�, ��, �ʷ� ȯ���ϴ� ���α׷�
		 */
		
		//������ ����
		Scanner scanner = new Scanner(System.in);
		int input = 0, second=0 , minut = 0, hour=0;
		System.out.println("���ϰ����ϴ� (�ð�)�ʸ� �Է��ϼ���");
		input = scanner.nextInt();
		//���� �Է¹��� �ʰ� 500�̶�� �Ѵٸ� 500�ʸ� 60���� ���� �������� ��
		// �� ���꿡�� ���� ���� �ٽ� 60���� ���� �������� ��
		// �� ���꿡�� ���� ���� �ð�
		
		second  = input % 60;
		minut = (input / 60) %60;
		hour = (input / 60) /60;
		
		System.out.println("�Է��Ͻ� �ʴ�\t"+input+"\n"+hour+"�ð�"+minut+"��"+second+"��");
		
	}

}
