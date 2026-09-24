package String;

public class Palindromic_Substrings {
    public int countSubstrings(String s) {
        int c=0;
        int odd_c=0;
        int even_c=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            odd_c=odd_c+pCount(s,i,i);
            even_c=even_c+pCount(s,i,i+1);
        }
        return odd_c+even_c;
    }
    public int pCount(String s,int left,int right){
        int n=s.length();
        int c=0;
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){

            c++;

            left--;
            right++;
        }
        return c;
    }
}
