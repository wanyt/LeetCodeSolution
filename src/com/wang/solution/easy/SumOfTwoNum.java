package com.wang.solution.easy;

//给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
//假设每个输入只对应一种答案，且同样的元素不能被重复利用。
public class SumOfTwoNum {

    public static void main(String[] args) {
//        int[] nums = {3, 7, 9, 11, 15};
//        int[] nums = {1, 2, 3, 7, 9, 11, 15};
//        int target = 9;

        int[] nums = {-3, 4, 3, 90};
//        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] ints = twoSumSolutionCommon(nums, target);

        System.out.println(nums[ints[0]]);
        System.out.println(nums[ints[1]]);
    }

    /**
     * 普通解法，该方法效率低下，寻找其他解法
     * <p>
     * 解题思路：
     * 使用双层for循环，外层for从0开始依次向下遍历直到length - 1，并记录当前遍历的索引的值
     * 内层for循环从外层for循环当前索引的下一个索引开始遍历，直到length，
     * 外层for循环的索引值加上内层for循环的索引值，如果和目标值相等则返回
     * <p>
     * 复杂度分析：
     * 该方法的复杂度是O(n)²，效率随着数组容量的增大呈指数级增长，不推荐使用
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumSolutionCommon(int[] nums, int target) {
        for (int index = 0; index < nums.length - 1; index++) {
            int curValue = nums[index];

            for (int nextIndex = index + 1; nextIndex < nums.length; nextIndex++) {
                int nextValue = nums[nextIndex];

                if (nextValue + curValue == target) {
                    int[] result = new int[2];
                    result[0] = index;
                    result[1] = nextIndex;
                    return result;
                }
            }
        }
        return new int[2];
    }


}
