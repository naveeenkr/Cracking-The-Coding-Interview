// 1.3 URLify
// Convert string from backwards.

import java.util.*;

class URLify {
    static String urLify(String s, int n){
        char [] chars = s.toCharArray();
        int count = s.length()-1;
        System.out.println(count);
        for(int i = n-1; i >=0 ; i--){
            if(chars[i] == ' '){
                chars[count--] = '0';
                chars[count--] = '2';
                chars[count--] = '%';
            }
            else
                chars[count--] = chars[i];
        }
        String ss = new String(chars);
        return ss;
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = in.nextInt();
		System.out.println("URL version of " + s + ": " + urLify(s, n));
	}
}
