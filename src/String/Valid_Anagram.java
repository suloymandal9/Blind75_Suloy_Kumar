//https://leetcode.com/problems/valid-anagram/description/

package String;
import java.util.HashMap;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        int[] arr1=new int[26];
        int[] arr2 =new int[26];

        int l1=s.length();
        int l2=t.length();

        if(l1!=l2){
            return false;
        }

        for(int i=0;i<l1;i++){
            int index= s.charAt(i)-'a';
            arr1[index]++;
        }
        for(int i=0;i<l2;i++){
            int index= t.charAt(i)-'a';
            arr2[index]++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;

    }
}




//public class Valid_Anagram {
//    public boolean isAnagram(String s, String t) {
//        int n=s.length();
//        HashMap<Character,Integer> h=new HashMap<>();
//        for(int i=0;i<n;i++){
//            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
//        }
//        if(s.length()!=t.length()){
//            return false;
//        }
//        for(char c : t.toCharArray()){
//            if(h.containsKey(c) && h.get(c)>0){
//                h.put(c,h.get(c)-1);
//            }
//            else{
//                return false;
//            }
//        }
//        return true;
//    }
//
//}