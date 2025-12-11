import java.util.*;
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        int ele1 =-1;
        int ele2 = -1;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int num : arr){
            if(num == ele1){
               cnt1 ++;
            } else if(num == ele2){
               cnt2 ++;
            }else if(cnt1 == 0){
               ele1 = num;
               cnt1 = 1;
            }else if(cnt2 == 0){
                ele2 = num;
                cnt2 = 1;
            }
            else{
               cnt1--;
               cnt2--;
               
        }
    }
     cnt1 = 0;
     cnt2 = 0;
    for(int num : arr){
        if(num == ele1) cnt1++;
        else if(num == ele2)cnt2++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(cnt1 > n/3){
            res.add(ele1);
        }
        if(cnt2 > n/3 && ele1 != ele2){
            res.add(ele2);
        }
        
        Collections.sort(res);
        return res;
        
    }
public static void main(String[] args){
 int arr[] = {2,2,3,1,3,2,1,1};
 Solution sol = new Solution();
 ArrayList<Integer> res =sol.findMajority(arr);
 System.out.println(res);
}    
    
}