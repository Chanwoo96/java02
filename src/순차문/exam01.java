package 순차문;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("나에 대한 정보");
		System.out.println("---------------------");
		System.out.println("이름을 입력하시오. ");
		String name=sc.next();
		System.out.println("나이를 입력하시오. ");
		int age=sc.nextInt();
		System.out.println("취미를 입력하시오. ");
		String hobby=sc.next();
		System.out.println("---------------------");
		System.out.println("나의 이름은"+name+"입니다.");
		System.out.println("나의 나이는"+age+"세 입니다.");
		System.out.println("나의 취미는"+hobby+"입니다.");
		
	}

}
