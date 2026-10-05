package String;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        HashSet<Character>hs=new HashSet<>();
        int ml=0;
        // int[] arr=s.toCharArray(s);
        for(int right=0;right<n;right++){
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            int length=right-left+1;
            ml=Math.max(length,ml);
        }
        return ml;

    }

}
