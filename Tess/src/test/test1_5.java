//package test;
//
//public class test1_5 {
//    // MyTime.java
//    public class MyTime {
//        private int day;
//        private int hour;
//        private int minute;
//
//        public MyTime() {
//            this.day = 0;
//            this.hour = 0;
//            this.minute = 0;
//        }
//
//        public MyTime(int hour, int minute) {
//            this.day = 0;
//            this.hour = hour;
//            this.minute = minute;
//        }
//
//        public MyTime(int day, int hour, int minute) {
//            this.day = day;
//            this.hour = hour;
//            this.minute = minute;
//        }
//
//        public MyTime add(MyTime s) {
//            MyTime result = new MyTime();
//            result.day = this.day + s.day;
//            result.hour = this.hour + s.hour;
//            result.minute = this.minute + s.minute;
//            return result;
//        }
//
//        public boolean equals(MyTime s) {
//            return this.day == s.day && this.hour == s.hour && this.minute == s.minute;
//        }
//
//        public String toString() {
//            return String.format("%d天%d小时%d分钟", day, hour, minute);
//        }
//
//        public String toCNString() {
//            return String.format("%d天%d小时%d分钟", day, hour, minute);
//        }
//    }
//
//// Demo.java
//import java.util.Scanner;
//
//    public class Demo {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("请输入起始时间（格式：天 小时 分）：");
//            MyTime startTime = new MyTime(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
//
//            System.out.println("请输入运行时间（格式：小时 分）：");
//            MyTime runningTime = new MyTime(scanner.nextInt(), scanner.nextInt());
//
//            System.out.println("请输入计划达到时间（格式：天 小时 分）：");
//            MyTime planTime = new MyTime(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
//
//            MyTime calculatedTime = startTime.add(runningTime);
//
//            System.out.println("程序计算出的到达时间：");
//            System.out.println(calculatedTime.toString());
//
//            System.out.println("输入的计划到达时间：");
//            System.out.println(planTime.toString());
//
//            if (calculatedTime.equals(planTime)) {
//                System.out.println("结果一致");
//            } else {
//                System.out.println("结果不一致");
//            }
//        }
//    }
//}
