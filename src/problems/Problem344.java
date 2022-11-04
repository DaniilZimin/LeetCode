package problems;

public class Problem344 {

    public static void main(String[] args) {

        char[] s = {'h','e', 'l', 'l', 'o'};

        reverseString(s);
    }

    public static void reverseString(char[] s) {

        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {

            char c;

            c = s[j];
            s[j] = s[i];
            s[i] = c;
        }
    }
}
