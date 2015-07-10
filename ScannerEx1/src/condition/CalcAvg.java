package condition;

import java.util.Scanner;

public class CalcAvg {
	public static void main(String[] args) {
			String name = "", msg=""; //선언
	  
	  int kor=0, eng=0, math=0, sum=0, avg=0; //점수는 연산이 필요해서 int타입으로 정해져야 한다.
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("이름 :");
	  name = scanner.next();
	  
	  System.out.println("국어 :");
	  kor = scanner.nextInt();
	  
	  System.out.println("영어 :");
	  eng = scanner.nextInt();
	  
	  System.out.println("수학 :");
	  math = scanner.nextInt();
	  
	  sum = kor + eng + math;
	  avg = (int)sum/3;  //소수점 이하 버림
	  
	  if (avg >= 90){
	   msg = "장학생";
	   
	  }else if ( (avg>=70) && (avg <90) ){
	   msg = "합격";
	   
	  }else{
	   msg = "불합격";
	  }
	  
	  System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
	  System.out.println("-----------------------------------------------------");
	  System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+msg);
	   
}
	}

