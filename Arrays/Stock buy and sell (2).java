// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
       int minsofar = prices[0];
       
       int res = 0;
       for(int i =0;i < prices.length; i++){
          minsofar = Math.min(minsofar,prices[i]);
          
          res = Math.max(res, prices[i] - minsofar); 

       }   
       return res;
      }


public static void main(String[] args){
    int prices[] = {7,10,1,3,6,9,2};
    Solution sol = new Solution();
    int res = sol.maximumProfit(prices);
    System.out.println(res);
}
}