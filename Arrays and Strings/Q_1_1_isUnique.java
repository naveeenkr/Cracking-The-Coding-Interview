// 1.1 IsUnique
// Assume ASCII of 256 chars.

import java.util.*;

class ISUnique {
    static boolean isUnique(String s){
        if(s.length() > 256) return false;
        boolean [] chars_s = new boolean[256];
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            if(chars_s[val]) return false;
            else chars_s[val] = true;
        }
        return true;
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println("isUnique " + s + ": " + isUnique(s));
	}
}
