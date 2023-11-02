package Arraynumber;

//public class Array {
//    public static int[] main(String[] args) {
//         //创建一个数组使用并理解length的用法
//         double [] marks=new double[5];
//         marks[0]=79;
//         marks[1]=84.5;
//         marks[2]=85;
//         marks[3]=98;
//         marks[4]=85;
//         System.out.println(marks[1]);
//         System.out.println(marks.length);
//         //利用for循环和length将数组遍历并输出来；
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
//         }

        //  //------------------------------------------------------------------


//         //数组元素的复制System.arragcopy(源数组；下标；目的数组；下标；多少元素)
//         int[]a={0,1,2,3,};
//         int[]b={1,2,3,4,5,6};
//         int[]c={3,4};
//         try {
//             System.arraycopy(a, 0, b, 0, 4);
//             //下面这句话将发生异常 溢出
//             System.arraycopy(a, 0, c, 0, 4);
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(e);
//         }
//         for(int elem:b){
//             System.out.print(elem+" ");
//         }
//         System.out.println();
//         for(int elem:c){
//             System.out.print(elem+" ");
//         }
//         System.out.println();
////____________________________________________________________________________







        //数组作为参数与返回值  举例返回值
        //元素反转
//class Main {
//    public static void main(String[] args) {
//        int[] list = {0, 1, 2, 3, 4, 5, 6, 7}; // 初始化数组
//        int[] reversedList = reverse(list); // 调用 reverse 方法进行数组元素反转
//
//        // 打印反转后的数组
//        for (int i : reversedList) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public static int[] reverse(int[] list) {
//        int[] result = new int[list.length];
//        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
//            result[j] = list[i]; // 元素反转
//        }
//        return result;
//    }
//}


////======================================================================================


//class VarargsDemo{
//public static double average(double...values){
//    double sum=0;
//    for(double value:values){
//        sum=sum+value;
//    }
//    double average=sum/values.length;
//    return average;
//}
// public static void main(String[] args) {
//     System.out.println(average(50,60,80));
//}
//}

//==================================================================================

//随机抽4张卡牌
//class DeckOfCards {
//    public static void main(String[] args) {
//        int[]deck=new int[52];
//        String[]suits={"黑桃","红桃","方块","梅花"};
//        String[]ranks={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//        //初始化每一张排
//        for(int i=0;i<deck.length;i++){
//            deck[i]=i;
//        }
//        //打乱顺序
//        for(int i=0;i<deck.length;i++){
//            //每次循环都随机产生一个元素的下标0-51
//            int index=(int)(Math.random()*deck.length);
//            //将产生的元素和当前元素交换
//            int temp=deck[i];
//            deck[i]=deck[index];
//            deck[index]=temp;
//        }
//        //显示输出前4张牌
//        for(int i=0;i<4;i++){
//            String suit=suits[deck[i]/13];//确定花色
//            String rank=ranks[deck[i]%13];//确定顺序
//            System.out.println(suit+" "+rank);
//        }
//    }
//}

