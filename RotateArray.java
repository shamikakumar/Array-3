// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// We reverse whole array
// Reverse arr till index k-1
// Reverse rest of the array
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n) k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    private void reverse(int[] nums, int start, int end){
        int i = start; int j = end;
        while(i<=j){
            swap(nums,i,j);
            i++; j--;
        }
    }
    private void swap(int[] nums, int i, int j){
        if(i==j) return;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}