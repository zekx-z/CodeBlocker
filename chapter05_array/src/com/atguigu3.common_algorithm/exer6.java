package com.atguigu3.common_algorithm;

/**
 * ClassName: exer6
 * Package: com.atguigu3.common_algorithm
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/8/6 - 17:00
 * @Version: v1.0
 */
public class exer6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i = 4; i < arr.length-1; i++) {
                arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
