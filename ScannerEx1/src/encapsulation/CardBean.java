package encapsulation;

/*
 * date : 2015.07.15
 * story : 생성자 문법
 생성자는 setter를 통해 값을 할당하는 
 기능을 보강하여, 객체가 만들어짐과 동시
 에 값을 할당하도록 특수하게 만들어진 ★★★메소드이다.
 
 */

public class CardBean {
	/*===Field===*/
	private String name, name1; //멤변
	private int num, num1;
	/*===Constructor===*/
	// 생성자 위치는 (멤버 )필드와 메소드 영영 사이에 위치
	// 생성자 모양
	// public 클래스 이름(){}
	public CardBean(){} // 디폴트 생성자
	
	
	public CardBean(String name) {
		//setter역할을 겸용하는 생성자
		this.name = name;
		this.num = (int) ((Math.random()*13)+1);
	}
	/*
	 * 디폴트 생성자는 개발자가 직접 만들지 않아도
	 * 프로그램 내부에서는 생성되 있는 것으로 인식한다.,
	 * 그런데, 이것을 꺼내든 이유는
	 * new 키워드를 통한 객체 생성역할뿐 아니라 생성과 동시에
	 * 값을 할당하는 기능을 추가시키기 위해서
	 */
	
	/*===Method===*/
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
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
