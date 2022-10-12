package problems;

public class Problem387 {
    public static void main(String[] args) {

        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {

        char[] chars = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        boolean b;

        for (int i = 0; i < chars.length; i++) {
            b = true;
            for (int j = 0; j < chars.length; j++) {
                if (i != j && chars[i] == chars[j]) {
                    b = false;
                    break;
                }
            }
            if (b) {
                return i;
            }
        }

        return -1;
    }
}
