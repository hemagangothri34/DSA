class Solution {
    public static void sort012(int[] arr) {
       int n = arr.length;
       int lo = 0;
       int hi = n -1;
       int mid = 0;
       
       
          while(mid <= hi){
           if(arr[mid] == 0){
               int temp = arr[mid];
               arr[mid] = arr[lo];
               arr[lo] = temp;
               lo++;
               mid++;
       }else if(arr[mid] == 1){
           mid++;
       }else {
           int temp = arr[mid];
           arr[mid] = arr[hi];
           arr[hi] = temp;
           hi--;
       }
        
    }
    }
    public static void main(String[] args){
        
        int arr[] = {0,1,2,0,1,2};
        int n = arr.length;
    
        sort012(arr);
      for(int i = 0; i < n;i++){
    System.out.println(arr[i] + " ");
    }
}
}