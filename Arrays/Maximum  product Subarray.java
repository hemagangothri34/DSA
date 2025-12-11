class Solution {
 public  int maxProduct(int[] arr) {
       if(arr == null|| arr.length == 0)return 0;
    long currMax = arr[0];
        long currMin = arr[0];
        long Maxprod  = arr[0];
        
        for(int i = 1; i < arr.length;i++){
        
            long temp = Math.max(arr[i],Math.max( arr[i]*currMax,arr[i]*currMin));
            currMin = Math.min(arr[i],Math.min(arr[i]*currMax,arr[i]*currMin));
            currMax = temp;
            
            Maxprod = Math.max(Maxprod,currMax);
         }
     return(int) Maxprod;
    }
    
}