package com.atguigu3.common_algorithm;

/**
 * ClassName: exer5
 * Package: com.atguigu3.common_algorithm
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/8/6 - 16:47
 * @Version: v1.0
 */
public class exer5 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int[] arr1=new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        arr1[arr.length]=10;
        arr1[arr.length+1]=20;
        arr1[arr.length+2]=30;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
