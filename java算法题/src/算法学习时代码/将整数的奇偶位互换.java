package 算法学习时代码;

public class 将整数的奇偶位互换 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=6;
		int b=m(a);
		System.out.println(b);
	}
	private static int m(int i) {
		int ou=i&0xaaaaaaaa;//和10101010101010做位运算去偶数
		int ji=i&0x55555555;//和01010101010101做位运算取奇数
		return(ou>>1)^(ji<<1) ;//连起来
	}

}
