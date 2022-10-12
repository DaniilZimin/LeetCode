package problems;

public class Problem28 {

    public static void main(String[] args) {

        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bbb"));
        System.out.println(strStr("aaaaa", ""));
        System.out.println(strStr("a", "a"));
        System.out.println(strStr("mississippi", "issip"));
    }

    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty() || haystack.equals(needle)) {
            return 0;
        }

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        return -1;
    }
}