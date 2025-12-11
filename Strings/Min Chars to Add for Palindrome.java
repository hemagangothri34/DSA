class Solution {
    public  static int minChar(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String temp = s + "$" + rev;
        
        int n = temp.length();
        int[] lps = new int[n];
        
        int len = 0;
        int i = 1;
        while (i < n){
            if(temp.charAt(i) == temp.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1];
                }else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return s.length() - lps[n - 1];
        
    }
    
    public static void main(String[] args){
        String s = "aacecaaaa";
        System.out.println(minChar(s));
    }
}