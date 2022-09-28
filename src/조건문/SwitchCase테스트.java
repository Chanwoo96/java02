package 조건문;

import java.util.Date;

import javax.xml.crypto.Data;

public class SwitchCase테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date= new Date();
		int month = date.getMonth()+1;
		int day = date.getDay();
		
		switch (day) {
		case 0:case 6:
			System.out.println("놀자.");
			
			break;

		default://else,1~5
			System.out.println("자바 공부하러 가자.");
			break;
		}
		
		switch (month) {
		case 3:case 4:case 5:
			System.out.println("봄");
			
			break;
		case 6:case 7:case 8:
			System.out.println("여름");
			
			break;
		case 9:case 10:case 11:
			System.out.println("가을");
			
			break;

		default:
			System.out.println("겨울");
			break;
		}
		
	}

}
