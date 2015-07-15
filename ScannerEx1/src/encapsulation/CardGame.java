package encapsulation;

public class CardGame {
	//생성자 단축키
	//ctrl + space
	
	private String winner; //멤변선언
	
	public CardGame() {} // 디폴트 생성자
	
	public CardGame(CardBean been1, CardBean been2) {
		// getter 에서 문제해결 패턴
				// 제일 먼저 리턴타입을 카피
				String winner = "";
				if (been1.getNum() > been2.getNum()) {
					winner = been1.getName() + "승리";
					
				} else if(been2.getNum() > been1.getNum()){
					winner = been2.getName() + "승리";
				}else{
					winner = "비김";

				}
				this.winner=winner;
	}
	public String getWinner() {
		return winner;
	}

}
