class Solution {
    void pushZerosToEnd(int[] arr) {
    int n = arr.length;
    int count = 0;
    for(int i = 0;i < n; i++){
        if(arr[i]!= 0){
            arr[count] = arr[i];
            count +=1;
        }
    }
    while(count < n){
        arr[count] = 0;
        count ++;
    }
    
    }
    
    
    public static void main(String[] args){
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        Solution sol = new Solution();
        sol.pushZerosToEnd(arr);
        
        for(int num : arr){
            System.out.println("num "+arr);
        }
    }
}