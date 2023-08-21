package com.atguigu3.common_algorithm;

/**
 * ClassName: exer7
 * Package: com.atguigu3.common_algorithm
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/8/6 - 17:23
 * @Version: v1.0
 */
public class exer7 {
    public static void main(String[] args) {
        int[] arr=new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== 5){
                System.out.println(i);
                break;
            }
            System.out.println("number:"+i);
        }
    }
}
