package condition;

/*
 *  date: 2015.07.08
 *  Author : me
 *  @ story : If�� �ִ� ������ ���� ����
 */
public class AntiPattenOnlyIf {
	public static void main(String[] args) {
		/*
		 ����(statement)
		 �ڹ� ����Ŀ��� 3���� ������ �������� ������
		 1. ���ǹ�
		 if, if-else, switch
		 2. �ݺ���
		  while, do-while, for
		 3. ��Ÿ����
		  continue, break, return
		 
		 */
		int x=1, y=2; //�������� �ʱ�ȭ
		if (x == y) {  // ���� ���� �� �����ڴ� ==
			System.out.println("���� x�� y�� ���� ����");
		}
		if (x != y) { // !�� ����(not) ������
			System.out.println("���� x�� y�� ���� �ٸ���");
			
		}
		if (x > y) {
			System.out.println("���ڿ� x�� y���� ũ��");
		}
		if (x < y) {
			System.out.println("���ڿ� x�� y���� �۴�");
		}
		if (x >= y) {
			System.out.println("���ڿ� x�� y���� ũ�ų� ����");
		}
		if (x <= y) {
			System.out.println("���ڿ� x�� y���� �۰ų� ����");
		}
		/*
		 �� ������ �ݵ�� �ϳ��� ������� �����ϰԲ� �ڵ��Ǿ�� �Ѵ�.
		 ���� onlyIf���� �ڵ��Ҷ��� �����ڰ� �� �Ѱ��� ���̽��� ����� ���̶��
		 Ȯ���� ���� �� �ٷ��.
		 */

	}

}
