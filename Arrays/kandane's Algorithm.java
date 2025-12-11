class Solution {
    int maxSubarraySum(int[] arr) {
        int  n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        
        for(int i = 1;i < n;i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
        
    }
    
    public static void main(String[] args){
        int arr[] = {2,3,-8,7,-1,2,3};
        Solution sol = new Solution();
        int res = sol.maxSubarraySum(arr);
        System.out.println(res);
    }
}