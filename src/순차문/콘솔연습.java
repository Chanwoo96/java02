package 순차문;

import java.util.Scanner;

public class 콘솔연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner를 새롭게 만들어서
		// 이클립스의 콘솔뷰에서 입력을 받아보자.!
		Scanner sc = new Scanner(System.in);
		
		//Scanner는 입력하기 전에 무엇을 입력할 지
		//먼저 프린트를 해주세요.!
		System.out.print("이름을 입력하시오.");
		String name = sc.next();// 입력을 받음. String
		System.out.println("입력받은 이름은 "+name+"입니다.");
		
		System.out.println("소속을 입력:");
		String com=sc.next();
		System.out.println("입력받은 소속은 "+com+"입니다.");
		
	}

}
