package 조건문;

import java.util.Date;

public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		int hour=date.getHours();
		int days=date.getMonth()+1;
		if (hour<11) {
			System.out.println("굿모닝");
			
		}else if (15>hour&&hour>=11) {
			System.out.println("굿애프터눈");
			
		}else {
			
			System.out.println("굿나잇");
		}
		System.out.println(days);
		
		if (days==2) {
			System.out.println("이 달은 28일까지 있습니다.");
		} else if (days == 4 ||days ==6||days ==9 ||days ==11) {
			System.out.println("이 달은 30일까지 있습니다.");
			
		}else {
			System.out.println("이 달은 28일까지 있습니다.");
			
		}
		
		
		
	}

}
