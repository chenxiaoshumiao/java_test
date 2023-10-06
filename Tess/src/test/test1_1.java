package test;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class test1_1 {

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入数组长度");
    int length= sc.nextInt();
    int[]score=new int[length];
    System.out.println("请输入你想求的成绩");
    for(int i=0;i<length;i++){
        score[i]=sc.nextInt();
    }
//int[] score ={65,85,98,75,86,95,85,98,55,65,89,54,65,98,65};
int max=0;
int count=0;
    int tp = 0;
    for (int j : score) {//此处为增强for循环,意思用int j;依次获取数组 score 中的每个元素的值
        //for (int i = 0; i < score.length; i++) {
        //    int j = score[i];
        tp+= j;
        if (j > max) {
            max = j;
            count = 1;
        } else if (j == max) {
            count++;
        }
    }
    double aeg = tp/ score.length;
    System.out.printf("最高分有 %d人,最高分为%d,平均分为%.2f",count,max,aeg);
}}
