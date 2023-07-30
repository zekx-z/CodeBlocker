/**
 * ClassName: OneArray
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: zekx
 * @Create: 2023/7/30 - 09:42
 * @Version: v1.0
 */

/**
 * 数组：是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。
 *
 * 特点1：紧密排列、有序的。
 * 特点2：一旦初始化完成，长度就确定了，且不能更改。
 *
 * 引用数据类型
 *
 * 按照元素的分类：基本数据类型元素的数组；引用数据类型元素的数组
 * 按照数组的维数来分：一维数组、二维数组。。。
 *
 *
 */

public class OneArray {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        //声明 初始化
        //静态初始化
        double[] prices = new double[]{20.32,43.21,43.22};
        double[] prices2 = {20.32,43.21,43.22};//类型推断

        //动态初始化
        String[] foods = new String[4];


        System.out.println(prices[1]);
    }
}
