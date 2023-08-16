package com.automation;
//Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.
// Then return the number of unique elements in nums.
public class RemoveDuplicate26 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 9, 6, 5, 3, 2};
        int uniqueCount = removeDuplicates(nums);
        System.out.println("Unique numbers: " + uniqueCount);

    }
    public static int removeDuplicates(int[] nums){
        int j = 1;
        for(int i= 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}


