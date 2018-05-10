package com.wang.solution.easy;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 数值范围是 [−2^31,  2^31 − 1]
 * 如果翻转后的证书溢出则返回 0
 * <p>
 * 例
 * 输入：123
 * 输出：321
 * <p>
 * 输入：-123
 * 输出：-321
 * <p>
 * 输入：120
 * 输出：21
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int x = 123;
//        int x = 1534236469;
        int rx = reverse(x);
        System.out.println(rx + "");
    }

    /**
     * 解题思路，使输入的数递归模以10, 从末尾每次取出一个数字乘以10加上先前的结果
     *
     * 算法比较啰嗦
     */
    private static int reverse(int x) {
        boolean isN = false;
        int max = 0x7fffffff;
        int min = 0x80000000;

        if (x < 0) {
            x = 0 - x;
            isN = true;
        }

        long value = 0;
        while (x > 0) {
            if (x < 10) {
                value = value + x;
                x = 0;
            } else {
                int mo1 = x % 10;
                value = mo1 * 10 + value * 10;
                if (value > max || value < min) {
                    //是否溢出
                   return 0;
                }
                x = (x - mo1) / 10;
            }
        }

        if (isN) {
            value = 0 - value;
        }

        return (int)value;
    }

    private static int mo(int x) {
        return x % 10;
    }

}
