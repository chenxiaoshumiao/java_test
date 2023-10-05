public class test1_1 {

public static void main(String[] args){
int[] score ={65,85,98,75,86,95,85,98,55,65,89,54,65,98,65};
int max=0;
int count=0;
double arg;
int sz=0;
    for (int j : score) {
        sz += j;
        if (j > max) {
            max = j;
            count = 1;
        } else if (j == max) {
            count++;
        }
    }
    arg=sz/score.length;
    System.out.println("最高分有"+count+"人,"+"最高分为"+max+",平均分为"+arg);
}}
