class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n -1;
       while(left < right){
            if(left < right){
                arr[left] = arr[left] + arr[right];
                arr[right] = arr[left] - arr[right];
                arr[left] = arr[left] - arr[right];
                left++;
                right--;
            }
        }
        
        }
     public static void main(String[] args){
         int arr[] = {1,2,3,4};
         Solution sol = new Solution();
         sol.reverseArray(arr);
         for(int i = 0; i< arr.length; i++){
            System.out.println("num ="+arr);
         }
     }   
    }