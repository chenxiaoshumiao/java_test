package test;

//public class test1_2 {
//    public static void main(String[] args){
//        int count=0;
//        int i=2;
//        for(int num=2;num<1e5;num++){
//           for(i=2;i<num;i++){
//               if(num%i==0){
//                   break;
//               }
//           }
//           if(i==num){
//               count++;
//               System.out.print(num+"\t");
//               if(count%10==0){
//                   System.out.println("\t");
//           }
//            }
//        }
//        }
//    }
public class test1_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 2; num < 1e6; num++) {
            boolean isPrime = true;
            // 只需要判断到num的平方根即可
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.printf("%-8d", num); // 使用Printf控制输出宽度为8个字符
                if (count % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
