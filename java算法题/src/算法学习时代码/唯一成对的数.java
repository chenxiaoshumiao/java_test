package 算法学习时代码;

//import java.util.Random;
import java.util.*;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.rmi.CORBA.Util;

public class 唯一成对的数 {
	public static void main(String[]args) {
		int N=11;
		int[]arr=new int[N];
		for (int i = 0; i < arr.length-1; i++) {
			 arr[i]=i+1;
		}
		//最后一个数是随机数
		arr[arr.length-1]=new Random().nextInt(N-1)+1;//从0到指定数不包含指定数
		//产生一个随机下标使随机数进入其中不在最后一位
		int index=new Random().nextInt(N);
		Object insex;
		swap(arr,index,arr.length-1);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		int x=0;
		for (int i = 1; i <=arr.length-1; i++) {
			x=x^i;
		}
		//System.out.println(x);
		//System.out.println(1^3^4^2);
		for (int i = 0; i < arr.length; i++) {
			x=x^arr[i];
		}
		System.out.println(x);
		System.out.println("========================================");
		int[] arr2=new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]]+=1;
		}
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i]==2) {
				System.out.println(i);
			}
		}
		}

	public static void swap(int[]arr,int  insex,int index2) {
		int temp=arr[insex];
		arr[insex]=arr[index2];
		arr[index2]=temp;
	}

}
