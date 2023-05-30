package com.automation;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int []nums = {2, 7, 11, 16};
        int target =9;
//        int[] indices = twoSum(nums, target);
//        System.out.println("Indices: " + indices[0] + ", " + indices[1]);
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return null;
    }
}
