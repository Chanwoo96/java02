package 반복문;

import java.util.Scanner;

public class popular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iu = 0;
		int you = 0;
		int bts = 0;

		System.out.println("인기투표");
		while (true) {
			System.out.print("입력 1)아이유 2)유재석 3)방탄 4) 투표 그만하기>> ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice==4) {
				
				System.out.println("아이유: "+iu);
				System.out.println("아이유: "+iu);
				System.out.println("유재석: "+you);
				System.out.println("방탄: "+bts);
				break;
			}
			else if (choice == 1) {
				iu++;

			} else if (choice == 2) {
				you++;
			} else if (choice == 3) {
				bts++;
			} else {
				System.out.println("없는 번호 입니다 다시 입력해 주세요");
			}
//			System.out.println("아이유: "+iu);
//			System.out.println("유재석: "+you);
//			System.out.println("방탄: "+bts);
//			System.out.print("계속 투표 하시겠습니까?(o,x) ");
//			Scanner sc2 = new Scanner(System.in);
//			String roop = sc2.next();
//			char roop1 = roop.charAt(0);
//
//			if (roop1 == 'x') {
//				break;
			}
		}
	}


