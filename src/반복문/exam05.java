package 반복문;

public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 33; i <= 222; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		int sum1 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum1 = sum1 + i;

		}
		System.out.println(sum1);
		int sum2 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		// 2번
		int sum3 = 0;
	
		for (int i = 1; i <1000; i=i+3) {
			if (sum3>100) {
				break;
			}
			if (i%5!=0) {
				sum3=sum3+i;

				System.out.println(i);
			}
			
			
		}
		System.out.println(sum3);
		
	}

}
