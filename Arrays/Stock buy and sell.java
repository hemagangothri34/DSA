class Solution {
    public int maximumProfit(int prices[]) {
       int n = prices.length;
       int lMin = prices[0];
       int lMax = prices[0];
       int res = 0;
       int i = 0;
       while(i < n -1){
          while(i < n -1 && prices[i] >= prices[i + 1]){
              i++;
            
          }
          if(i == n -1)break;
           lMin = prices[i];
          while(i < n -1 && prices[i] <= prices[i + 1]){
              i++;
              lMax = prices[i];
          }
          res += (lMax -lMin);
          
        
    }
     return res;
}
public static void main(String[] args){
    int arr[] = {100,180,260,310,40, 535,695};
    Solution sol = new Solution();
     int res = sol.maximumProfit(arr);
    System.out.println(res);
}
}