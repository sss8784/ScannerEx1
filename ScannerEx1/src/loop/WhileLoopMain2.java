package loop;

public class WhileLoopMain2 {
	public static void main(String[] args) {
		//선언부
		int idx = 0;
		//연산부
		while(true){
			idx++;
			System.out.println(idx+"\t");
			if (idx==10) {
				break;
			}
		}
		//출력부
		System.out.println();
	}
	

}

