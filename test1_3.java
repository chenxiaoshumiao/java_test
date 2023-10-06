import java.util.Scanner;

public class test1_3 {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
while(true){
    System.out.println("请输入层数：");
    int num= sc.nextInt();
    for(int i=1;i<=num;i++){
        for(int k=1;k<=num-i;k++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print((i%2==0?"2":"1")+" ");
    }
System.out.println();
    }
     }
}
}


