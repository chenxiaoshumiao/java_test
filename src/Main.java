import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int a= sc.nextInt();
        int []Ma=new int[1000000];
        int []Mb=new int[1000000];
        for(int i=a-1;i>=0;i--){
            Ma[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        for(int i=b-1;i>=0;i--){
            Mb[i]=sc.nextInt();
        }
            mins(N,Ma,Mb,a,b);
    }
    public static void mins(int N,int[]Ma,int[]Mb,int a,int b){

        long ans =0;
            for(int i=(a>b?a:b)-1;i>=0;i--){
               ans= (long) ((ans*Math.max(Math.max(Ma[i],Mb[i])+1,2)+Ma[i]-Mb[i])%(1e6+7));

        }
        System.out.println(ans);
    }
}









//import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//public class Test {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = reader.readLine().trim().split("\\s+");
//        int N = Integer.parseInt(input[0]);
//
//        reader.close();
//    }
//
//
//}
//    public static void longs(int N) {
//       // int[] tree = new int[N];
//        int[] longss = new int[N];
//        int i = 0;
//        for (i = 0; i < N / 2; i++) {
//            longss[i] = longss[N - 1 - i] = 2 * (N - i - 1);
//            if (N % 2 != 0) {
//                longss[N / 2] = 2 * (N / 2);
//            }
//        }
//        for (int k : longss) {
//            System.out.println(k);
//        }
//    }}



//        while (i<3){
//            if(i!=1) {
//                for (int j = 0; j < N; j++) {
//                    for (int a = 0; a < N; a++) {
//                        tree[a] += 1;
//                        tree[j]=0;
//
//                        if (tree[a] > longss[a]) {
//                            longss[a] = tree[a];
//                        }
//                    }
//
//                }
//            }else{
//                for(int j=N-1;j>=0;j--){
//                    for (int a = 0; a < N; a++) {
//                        tree[a] += 1;
//                        tree[j]=0;
//
//                        if (tree[a] > longss[a]) {
//                            longss[a] = tree[a];
//                        }
//                    }
//
//
//                    }
//                }
//            i++;
//            }

//        for(int k:longss){
//            System.out.println(k);
//        }
//        }
//
//}
