// Missing number in array
// EasyAccuracy: 29.59%Submissions: 849K+Points: 2

// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

// Example 1:

// Input:
// N = 5
// A[] = {1,2,3,5}
// Output: 4
// Example 2:

// Input:
// N = 10
// A[] = {6,1,2,8,3,4,7,10,5}
// Output: 9

// Your Task :
// You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)


// Constraints:
// 1 ≤ N ≤ 10^6
// 1 ≤ A[i] ≤ 10^6


class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sumTotal1 = n*(n+1)/2;
        int sumTotal2 = 0;
        
        for(int i=0; i<array.length; i++){
            sumTotal2 += array[i];
        }
        
        return sumTotal1 - sumTotal2;
    }
}
