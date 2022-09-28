package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int target= r.nextInt(100);
		int count=0;
		int count2=0;
		while (true) {//무한루프
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count=count+1;
			int data2 = Integer.parseInt(data);
			if (data2 == target) {
				System.out.println("정답입니다. 축하합니다.");
				JOptionPane.showMessageDialog(null, "총 "+count+"번 시도하셨습니다.");
				JOptionPane.showMessageDialog(null, "총 "+count2+"번 틀리셨습니다.");
				JOptionPane.showMessageDialog(null,"다음에 또 방문해 주세요."); 
				JOptionPane.showMessageDialog(null, "정답은"+target+"입니다");
			System.exit(0);//while문의 break6
		} else {
				System.out.println("오답입니다.");
				count2++;
				if (data2>target) { 
					System.out.println("너무 큽니다.");
					
				}else {
					System.out.println("너무 작습니다.");
					
					
				}

			} //else
		}//while
	}

}
