package condition;

public class OnlyIf {
	public static void main(String[] args) {
		int x=1, y=2; //지변초기화
		if((x==1) && (y==1)){ // 엔퍼센트, and연산
			System.out.println("x는 1 이면서 y도 2이다");
		}else if ((x==3) || (y==3)) { // 컬럼, or연산
			System.out.println("x는 1이거나, y는 2이다");
		}else{
			System.out.println("해당사항이 없습니다.");
			
		}
	}
	

}
