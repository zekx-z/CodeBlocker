import java.util.Scanner;

/**
 * ClassName: exer3
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/7/30 - 20:57
 * @Version: v1.0
 */
public class exer3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int[] arr=new int[num];
        int max=0;
        int temp;


        for (int i = 0; i < arr.length; i++) {
            temp=scanner.nextInt();
            arr[i]=temp;
            if(temp>max){
                max=temp;
            }
        }
        System.out.println("最大值"+max);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=(max-10)){
                System.out.println(arr[i]+" "+"A");
            }
        }
    }

}
