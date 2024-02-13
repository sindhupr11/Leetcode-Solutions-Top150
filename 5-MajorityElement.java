/*

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

*/  

//moores voting algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int c = 0, x = 0;
        for(int i = 0; i<nums.length;i++){
            if (c == 0)
                x = nums[i];
            if (x == nums[i])
                c++;
            else
                c--;
        }
        return x;
    }
}
