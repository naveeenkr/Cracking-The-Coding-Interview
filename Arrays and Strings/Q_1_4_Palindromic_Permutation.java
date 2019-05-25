// 1.4 Palindrome permutation

import java.util.*;

class PalindromePermutation {
    static boolean isPalindromicPermutation(String s){
        boolean [] chars = new boolean[256];
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ') continue;
            chars[s.charAt(i)] = !chars[s.charAt(i)];
        }
        for(int i =0;i<256;i++){
                if(chars[i]) ans++;
            }
        System.out.println(ans);
        return ans <= 1 ? true : false;
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println("is palindrome permutation " + s + ": " + isPalindromicPermutation(s.toLowerCase()));
	}
}
