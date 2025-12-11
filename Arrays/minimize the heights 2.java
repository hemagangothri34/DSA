
import java.util.Arrays;
class Solution {
    public int getMinDiff(int[] arr, int k) {
       int n = arr.length;
       Arrays.sort(arr);
       int res = arr[n-1] - arr[0];
       
       for(int i = 1;i < n;i++){
           if(arr[i] - k < 0)continue;
               
          int minH = Math.min(arr[0] + k,arr[i] - k);
          int maxH = Math.max(arr[i-1] + k,arr[n-1] - k);
          
          res = Math.min(res, maxH - minH);
           }
           return res;
       
        
    }


public static void main(String[] args){
    int arr[] = {1,5,8,10};
    int k = 2;
    Solution sol = new Solution();
 int res = sol.getMinDiff(arr,k);
   System.out.println(res); 
}
}