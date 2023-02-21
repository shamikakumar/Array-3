// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// For each index we need to find max on the right and left side and use the min of that to find trapped rainwater
// Instead of finding max for each element, we take max of full array
// This max height will be right wall for all elements before it and left wall for all elements after
class Solution {
    public int trap(int[] height) {
        int max = 0; int maxIdx =0;
        int res = 0;
        for(int i=0;i<height.length;i++){
            if(height[i]>max){
                max = height[i];
                maxIdx = i;
            }
        }
        int i=0; int left = height[0];
        while(i<maxIdx){
            if(left>=height[i]){
                res+=left-height[i];
            }
            else{
                left = height[i];
            }
            i++;
        }
        i = height.length-1; int right = height[height.length-1];
         while(i>maxIdx){
            if(right>=height[i]){
                res+=right-height[i];
            }
            else{
                right = height[i];
            }
            i--;
        }
        return res;
    }
}