// User function Template for Java

 public class Solution {
    public  static String addBinary(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0|| j >=0 || carry > 0){
            int bit1 = (i >= 0)? s1.charAt(i) - '0' : 0;
            int bit2= (j >= 0) ?s2.charAt(j) -'0' : 0;
            int sum = bit1 + bit2 + carry;
             result.append(sum % 2);
             carry = sum / 2;
             
             i--;
             j--;
        }
        result.reverse();
        
        int k = 0;
        while(k < result.length() && result.charAt(k) == '0'){
            k++;
            
        }
        return(k == result.length()) ? "0" : result.substring(k);
        
    }
    public static void main(String[] args){
        String s1 = "1101";
        String s2 = "111";
        System.out.println(addBinary(s1, s2));
        
        String s3 = "00100";
        String s4 = "010";
        System.out.println(addBinary(s3, s4));
    }
}