package 快速排序;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class QuickSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("请输入待排序的数组（以空格分隔）：");
        String[] input = reader.readLine().trim().split("\\s+");
        int[] nums = new int[reader.read()];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        quickSort(nums,0,nums.length-1);
    }
    public static void quickSort(int[] nums, int left, int right) {

    }
    public static void partition(){

    }
    public static void swap(int[]nums,int i,int j){
    int tmp=nums[i];
    nums[i]=nums[j];
    nums[j]=tmp;
    }
}
