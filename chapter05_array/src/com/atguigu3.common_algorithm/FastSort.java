package com.atguigu3.common_algorithm;

import java.util.Arrays;

/**
 * ClassName: FastSort
 * Package: com.atguigu3.common_algorithm
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/8/21 - 20:55
 * @Version: v1.0
 */
public class FastSort {
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,2,5,8,45,3};
Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
