// 1.2 check permutation
//Assume ASCII of 256 chars and check count of chars in both string is same or not.

import java.util.*;

class CheckPermutation {
    
    static boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int char_count[] = new int[256];
        for(int i=0;i<s1.length();i++){
            char_count[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            char_count[s2.charAt(i)]--;
            if(char_count[s2.charAt(i)] < 0 ) return false;
        }
        return true;
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		System.out.println("isPermutation " + s1 + " & " + s2 + ": " + isPermutation(s1, s2));
	}
}
