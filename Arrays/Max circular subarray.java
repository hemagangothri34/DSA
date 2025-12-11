class Solution {
    public int maxCircularSum(int arr[]) {
        
        int n = arr.length;
        int currMax = arr[0];
        int maxNormal = arr[0];
        int currMin = arr[0];
        int minSubarray = arr[0];
        int totalSum = arr[0];
        
        for(int i = 1;i < n;i++){
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxNormal = Math.max(maxNormal, currMax);
            
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSubarray = Math.min(minSubarray,currMin);
            
            totalSum += arr[i];
        }
        if(maxNormal < 0)return maxNormal;
        
        return Math.max(maxNormal, totalSum - minSubarray);
    }
    
    
    public static void main(String[] args){
        Solution sol = new Solution();
        int arr[] = {8, -8, 9, -9,10, -11, 12};
        int res = sol.maxCircularSum(arr);
        System.out.println(res);
    }
}