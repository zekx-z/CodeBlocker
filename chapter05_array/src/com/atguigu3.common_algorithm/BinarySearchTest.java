package com.atguigu3.common_algorithm;

/**
 * ClassName: BinarySearchTest
 * Package: com.atguigu3.common_algorithm
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/8/6 - 17:47
 * @Version: v1.0
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int target=5;
        int head=0;//默认的首索引
        int end= arr.length-1;//默认的尾索引

        boolean isFlag=false;

        while(head<=end){
            int mid=(int)(head+end)/2;
            if(target==arr[mid]){
                System.out.println("bingo");
                isFlag=true;
                break;
            } else if (target>arr[mid]) {
                head=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;

            }

        }
        if(isFlag==false){
            System.out.println("fail");
        }

    }
}
