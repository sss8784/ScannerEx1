package controller;

import condition.ManOrWoman;
import condition.SwitchAvg;

public class OperatorController {
	public static void main(String[] args) {
		//2015.07.10 switch 성적계산기
		SwitchAvg avg2 = new SwitchAvg();
		avg2.calc();
		//avg.calcAvg();
		//2015.07.10 
		ManOrWoman manOrWoman = new ManOrWoman();
	    manOrWoman.ssn(); //ssn()는 원 클래스의 메스드 이름이다.
	}

}
