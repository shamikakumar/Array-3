// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// We only care about the indexes<=n since hindex will lie in that range
// So we use bucket sort to get the sorted citations
// We then go over the array and check for the condition n>=h, n-h<h
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n+1];
        int res=0;
        for(int i=0; i<n; i++){
            int c = citations[i];
            if(c >= n) arr[n]++;
            else arr[c]++;
        }
        int sum=0;
        for(int i=n; i>=0; i--)
        {
             sum+=arr[i];
             if(sum>=i)
                return i;
        }
        return -1;
    }
}