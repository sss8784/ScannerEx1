package operater;
/*
 *  date: 2015.07.08
 *  Author : me
 *  @ story : ���׿����ڹ���
 */
public class Infix {
	public static void main(String[] args) {
		// ���� �� �ʱ�ȭ ����
		int x=20, y=7, add=0, sub=0, gob=0, mok=0, nmg=0;
		// ���꿵��
		add = x+y;
		sub = x-y;
		gob = x*y;
		mok = x/y;
		nmg = x%y;
		
		System.out.println("+���:\t"+add);
		System.out.println("-���:\t"+sub);
		System.out.println("*���:\t"+gob);
		System.out.println("/���:\t"+mok);
		System.out.println("%���:\t"+nmg);

	}

}
