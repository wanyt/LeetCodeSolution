package com.wang.solution.easy;

//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
public class RemoveDuplicateInArray {

    public static void main(String[] args) {

        int[] nums = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4};

        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

//        System.out.println("jfiea");

    }


    /**
     * 1，记录第一个角标的值
     * 2，从第二个位置开始遍历，只要和第一个位置的值不一样就把值赋给第二个索引
     *
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {

        int num = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                num = nums[i];
                index++;
                continue;
            }

            if (num != nums[i]) {
                nums[index] = nums[i];
                num = nums[i];
                index++;
            }
        }

        return index;
    }


}
