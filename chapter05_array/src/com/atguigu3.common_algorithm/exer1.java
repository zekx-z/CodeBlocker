package com.atguigu3.common_algorithm;

import java.util.Scanner;

/**
 * ClassName: xer1
 * Package: com.atguigu3.common_algorithm
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/8/6 - 13:24
 * @Version: v1.0
 */

//定义一个int型的一维数组，包含10个元素，分别赋一些随机整数， 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。 要求：所有随机数都是两位数。
//提示； [0,1) * 90 [0,90) + 10      [10,100) [10,99] (int)(Math.random() * 90 + 10)
public class exer1 {
    public static void main(String[] args) {
        int []arr1=new int[10];
        for (int i = 0; i < arr1.length; i++) {
            Scanner scanner=new Scanner(System.in);
            arr1[i]=scanner.nextInt();
        }

        int max=0;
        int min=arr1[0];
        int sum=0;


        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>max){
                max=arr1[i];
            }

            if(arr1[i]<min){
                min=arr1[i];
            }

            sum+=arr1[i];
        }
        int aver=sum/arr1.length;

        System.out.println("max:"+max);
        System.out.println("min:"+min);
        System.out.println("sum:"+sum);
        System.out.println("average:"+aver);

    }
}
