package encapsulation;



public class CardBean2 {
	private String name, name1; //멤변
	private int num, num1;
	
	public void setName(String name) { 
		// 괄호 안에 값을 파라미터라하고 소속은 지변이다
		this.name = name;
		// this.name은 인스턴스 변수 이고
		// =name은 파라미터로 넘어온 지변(스캐너가 받아논 값)
		// 스캐너가 받아 논 값을 가진 지변 값을
		// 멤변 name에 할당하라
		// 파라미터 값과 멤변값의 이름은 달라도 상관없다.
		// 단, 데이터 타입(String, int)은 반드시 일치해야한다,
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public String getWinner() {
		// getter 에서 문제해결 패턴
		// 제일 먼저 리턴타입을 카피
		String winner = "";
		if (this.num > this.num1) {
			winner = name + "승리";
			
		} else if(this.num1 > this.num){
			winner = name1 + "승리";
		}else{
			winner = "비김";

		}
		return winner;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("["+name+":"+num+"]"+"vs"+"["+name1+":"+num1+"]\n"
				+this.getWinner());
	}
	

}
