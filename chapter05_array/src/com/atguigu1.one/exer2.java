import java.util.Scanner;

/**
 * ClassName: exer2
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/7/30 - 20:48
 * @Version: v1.0
 */

//用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
public class exer2 {
    public static void main(String[] args) {
        String[] weekday=new String[]{"mon","tue","wed","thur","fri","sat","sun"};
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();

            System.out.println(weekday[i]);

        scanner.close();
    }
}
