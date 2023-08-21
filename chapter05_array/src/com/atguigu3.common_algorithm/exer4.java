package com.atguigu3.common_algorithm;

/**
 * ClassName: exer3
 * Package: com.atguigu3.common_algorithm
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/8/6 - 15:43
 * @Version: v1.0
 */
public class exer4 {
    public static void main(String[] args) {
        int []arr=new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int[] revert=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revert[i]=arr[arr.length-i-1];
            System.out.print(arr[i]+"\t");
            System.out.print(revert[i]);
            System.out.println();

        }


        }

}
