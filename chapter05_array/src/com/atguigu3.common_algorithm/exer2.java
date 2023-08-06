package com.atguigu3.common_algorithm;

/**
 * ClassName: exer2
 * Package: com.atguigu3.common_algorithm
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/8/6 - 13:55
 * @Version: v1.0
 */
public class exer2 {
    public static void main(String[] args) {
        int[][] arr=new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
            arr[i][0]=1;
            arr[i][i]=1;
            for (int j = 0; j < arr[i].length; j++) {
                if(j>0&&j<arr[i].length-1){
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
