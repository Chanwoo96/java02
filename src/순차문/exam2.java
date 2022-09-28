package 순차문;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("나에 대한 정보");
		System.out.println("---------------------");
		System.out.println("이름을 입력하시오. ");
		String name=sc.next();
		System.out.println("나의 키를 입력하시오. ");
		double height=sc.nextDouble();
		System.out.println("나의 몸무게를 입력하시오. ");
		double weight=sc.nextDouble();
		System.out.println("저녁을 먹었나요. ");
		boolean dinner = sc.nextBoolean();
		System.out.println("좌우명은 무엇인가요. ");
		sc.nextLine();
		String res = sc.nextLine();
		
		
		System.out.println("---------------------");
		System.out.println("나의 이름은"+name+"입니다.");
		System.out.println("나의 키는"+height+"세 입니다.");
		System.out.println("나의 몸무게는"+weight+"입니다.");
		System.out.println("나는 저녁식사 여부는 "+dinner+"입니다.");
		System.out.println("나는 좌우명은 "+res+"입니다.");
		
	}

}
