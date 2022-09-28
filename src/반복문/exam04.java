package 반복문;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자 비교하기");
		System.out.println("==============");
		int count1 =0;
		int count2 =0;
		
		while (true) {
		System.out.print("첫숫자 입력하기: ");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		System.out.println("==============");
		System.out.print("뒷숫자 입력하기: ");
		Scanner sc2= new Scanner(System.in);
		int num1= sc2.nextInt();
		System.out.println("==============");
			if (num > num1) {
				count1++;
				System.out.println("앞 숫자가 더큽니다.");
				Scanner sc3= new Scanner(System.in);
			} else if(num< num1){

				System.out.println("뒷 숫자가 더큽니다.");
				count2++;
			} else {
				System.out.println("두 수가 동일합니다.");
				
			}
			System.out.println("종료하시겠습니까? (o,x)" );
			Scanner sc3= new Scanner(System.in);
			String roop= sc.next();
			char roop1 = roop.charAt(0);
			if (roop1=='x') {
				System.out.println("앞 숫자가 더 큰 횟수: "+count1);
				System.out.println("뒷 숫자가 더 큰 횟수: "+count2);
				break;
			}
			
		}
		
	}

}
