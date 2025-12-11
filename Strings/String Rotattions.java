class Solution {
   static boolean kmpSearch(String pat, String txt){
       int m = pat.length();
       int n = txt.length();
       
       int[] lps = new int[m];
       computeLPSArray(pat, m, lps);
       
       int i = 0;
       int j = 0;
       while(i < n){
           if(pat.charAt(j) == txt.charAt(i)){
               i++;
               j++;
           }
           if(j == m){
               return true;
           }else if (i < n && pat.charAt(j) != txt.charAt(i)) {
               if(j != 0)
               j = lps[j - 1];
               else 
                  i++;
           }
       }
       
       return false;
       
   }


static void computeLPSArray(String pat, int m, int[] lps){
    int len = 0;
     int i =1;
     lps[0] = 0;
     
     while( i < m) {
         if(pat.charAt(i) == pat.charAt(len)) {
             len++;
             lps[i] = len;
             i++;
         }else {
             if(len != 0){
                 len = lps[len - 1];
             }else {
                 lps[i] = 0;
                 i++;
             }
         }
     }
}

static boolean areRotations(String s1, String s2) {
    if(s1.length() != s2.length()) return false;
    
    String temp = s1 + s1;
    
    return kmpSearch(s2, temp);
}
}