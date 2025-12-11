class Main{
    void Reverse(int arr[], int left,int right){
        if(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }
    
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
       Reverse(arr,0,arr.length - 1);
        System.out.println("reverse of array: " + Arrays.toString(arr));
    }
}