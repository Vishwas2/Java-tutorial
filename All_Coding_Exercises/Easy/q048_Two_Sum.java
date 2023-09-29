/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

EXAMPLE :
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

package Exercises.All_Coding_Exercises.Easy;

public class q048_Two_Sum {
    public static void main(String[] args) {
        System.out.println("This is an easy leetcode problem.");
        int[] array = {2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(j + "," + i);
                    break;
                }
            }
        }
    }
}
