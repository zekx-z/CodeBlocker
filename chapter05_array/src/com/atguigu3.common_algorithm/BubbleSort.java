package com.atguigu3.common_algorithm;

/**
 * ClassName: BubbleSort
 * Package: com.atguigu3.common_algorithm
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/8/21 - 20:47
 * @Version: v1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{34,54,3,2,5,7,34,5,76,34,67};
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1-j; i++) {
                int temp=arr[i];
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
