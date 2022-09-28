package 조건문;

public class IfElse테스트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=88;
		String result ="0";
		if (score>=90) {
			result="A학점";
			
		}else if (score>=85 &&score<90) {
			result="B+학점";
			
		}else if (score>=80 &&score<95) {
			result="B-학점";
			
		}else if (score>=70) {
			result="C학점";
			
		}else {
			result="D학점";
			
		}
		System.out.println("당신의 학점은 "+result);
	}

}
