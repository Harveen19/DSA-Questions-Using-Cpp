//35. Search Insert Position
//Easy
//11K
//517
//Companies
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

//You must write an algorithm with O(log n) runtime complexity.
 
//Example 1:

//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:

//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:

//Input: nums = [1,3,5,6], target = 7
//Output: 4
 

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0, e=nums.length-1;
        while(s<=e){
            int mid= (s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return e+1;
    }
}