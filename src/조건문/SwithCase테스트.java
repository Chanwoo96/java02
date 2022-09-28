package 조건문;

public class SwithCase테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수(long X),문자1(char), 문자열(String)
		//자체 break 기능이 없어서, 프로그래머가 break를 써줘어야 한다.
		String name="자바";
		switch (name) {
		case "자바":
			System.out.println("1103호로");
			break;
		case "파이썬":
			System.out.println("1104호로");
			break;

		default:
			break;
		}
	}

}
