package 조건문;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pw = sc.next();
		switch (pw) {
		case "pass":
			System.out.println("들어오세요.");
			break;

		default:
			System.out.println("나가세요.");
			break;
		}
		int score= 88;
		if (score>90) {
			System.out.println("A학점");
		}else if(score>80) {
			System.out.println("B학점");
		}else if(score>70) {
			System.out.println("C학점");
			
		}else if(score>60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
			
		}
		Scanner sc2 = new Scanner(System.in);
		String food =sc2.next();
		switch (food) {
		case "짜장면":
			System.out.println("중국집으로 가세요.");
			break;
		case "라면":
			System.out.println("분식집으로 가세요.");
			break;
		case "회":
			System.out.println("횟집으로 가세요.");
			break;

		default:
			System.out.println("안 먹어요.");
			break;
		}
		
	}
}

