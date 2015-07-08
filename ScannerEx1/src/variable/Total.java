package variable;

public class Total {
	public static void main(String[] args) {
		// 국어점수는 데이터타입이 정수이다.
		// 변수명은 kor
		// 할당된 값은 80
		
		/*int kor = 80;
		int eng = 70;
		int meth = 50;
		System.out.println("국어점수는"+kor+"이다");
		System.out.println("영어점수는"+eng+"이다");
		System.out.println("수학점수는"+meth+"이다");
		*/
		int kor=60, eng=60, meth=60;
		int total = 0; // 지역변수 초기화
		total = kor + eng + meth; // 지역변수 연산
		int avg = 0; // 평균점수는 총점/ 과목수
		avg = total /3;
		System.out.println("총점수는 "+total);
		System.out.println("평균점수는 "+avg+"이다"); 
		
		
	}
}
/* 가독성
 * 사용자가 보고 이해하기 쉽도록 
 * 개발자가 추가적으로 
 * 지원하는 작업
 */
