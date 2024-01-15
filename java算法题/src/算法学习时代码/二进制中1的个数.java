package 算法学习时代码;

import java.util.Scanner;

public class 二进制中1的个数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int n=1;
		int count=0;
		System.out.println(Integer.toString(N,2));
		for (int i = 0; i < 32; i++) {
			if((N&(n<<i))==(n<<i)) {
				count++;
			}
					}
		System.out.println(count);
		System.out.println("+======================================================");
		
		//第二种方法可以将这个数无符号往右移动这样也行>>>。
		
		//第三种每次在减一的时候，再将减一后的数与原来的数&就会干掉一个原来的一.。
		count=0;
		while(N!=0) {
			N=(N-1)&N;
			count++;
	
		}
		System.out.println(count);
	}
//扩展用一条语句判断是不是2的整数次方；if(N-1)&N==0;
}
