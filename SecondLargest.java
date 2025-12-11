class Solution {
    public int getSecondLargest(int[] arr) {
       int  n = arr.length;
       int num = 0;
       int first = 0;
       int second = 0;
       for(int i = 0; i < n;i++){
           num = arr[i];
           if(num>first) {
               second = first;
               first = num;
           }
        else if(num>second && num != first){
            second = num;
        }
       }
       if(second == 0){
           return -1;
       }
       else{
           return second;
       }
       
        
    }
}