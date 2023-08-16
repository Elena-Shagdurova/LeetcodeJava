package com.automation;

//Given a sorted array of distinct integers and a target value,
// return the index if the target is found. If not, return the
// index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, 9};
        int target = 1;
        int ind = searchInsert(nums, target);
        System.out.println("The index of target num " + ind);
    }

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            //If the current element at index i is equal to the target element,
            // it means the target element is found in the array, and the code returns the index i immediately.
            if (nums[i] == target) return i;

            //This checks if the target element is smaller than the first element of the array.
            // If it is and we're at the beginning of the array (index 0),
            // the code returns index 0. This is because the target element should be inserted at the beginning.
            if (i == 0 && target < nums[i]) return i;

            //This condition checks if the target element falls between the elements at indices i-1 and i.
            // If this is true, it means the target element should be inserted between these two elements,
            // so the code returns index i.
            if (i > 0 && target > nums[i - 1] && target < nums[i]) return i;
            i++;
        }
        return i;
    }
}
