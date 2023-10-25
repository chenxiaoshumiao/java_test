package mytime;

import java.util.Scanner;

public class Damo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你出发的时间：>");
        Mytime star=new Mytime(sc.nextInt(),sc.nextInt());
        System.out.println("请输入运行的时间：>");
        Mytime run=new Mytime(sc.nextInt(),sc.nextInt());
        System.out.println("请输入计划到达时间：>");
        Mytime plan= new Mytime(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Mytime arive=star.Addtime(run);
        System.out.println("出发时间：>");
        System.out.println(star.toString());
        System.out.println("运行时间：>");
        System.out.println(run.CNtoString());
        System.out.println("计划到达时间：>");
        System.out.println(plan.toString());
        System.out.println("到达时间：");
        System.out.println(arive.toString());
        if(!arive.equals(plan)){
            System.out.println("结果一致");

        }
        else
            System.out.println("结果不一致");
    }
}
