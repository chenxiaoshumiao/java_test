  package 算法学习时代码;
import java.util.Scanner;
public class 零到一之间用浮点实数的二进制表示 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		double nums=sc.nextDouble();
		StringBuilder sb=new StringBuilder("0.");
		while(nums>0) {
			//乘2挪动整数
			nums=nums*2;
			if(nums>=1) {
				sb.append("1");
				//消除整数部分
				nums-=1;
//				System.out.println(nums);
			}else {
				sb.append("0");
			}
			if(sb.length()>34) {
				System.out.println("ERROR");
				return;
			}
		}
		System.out.println(sb.toString());
	}

}
