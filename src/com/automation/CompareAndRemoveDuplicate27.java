package com.automation;

public class CompareAndRemoveDuplicate27 {
    public static void main(String[] args) {
        int[] nums = {0,4,2,5,9,5,3,1};
        int val = 5;
        int uniqueNums = removeDuplicates(nums, val);
        System.out.println(uniqueNums);
    }
    public static int removeDuplicates(int[] nums, int val){
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
               nums[j] = nums[i];
               j++;
            }
        }
        return j;
    }
}






