package test;

import java.util.Scanner;
import static java.lang.System.in;

public class test1_4 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(in);
        while (true) {
            System.out.println("请输入加密的字母");
            String s = sc.nextLine();
            char cArr[] = s.toCharArray();
            for (int j=0;j<cArr.length;j++){
                if(j%3==0){
                    System.out.print((char)((cArr[j]-97+3)%26+97));
                }
                if(j%3==1){
                 
                    System.out.print((char) ((cArr[j]-97-3+26)%26+97));
                }
                if(j%3==2){
                    System.out.print((char) (cArr[j]));

}
            }


        }
    }
}