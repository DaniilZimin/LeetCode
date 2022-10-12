package problems;

public class Problem415 {
    public static void main(String[] args) {

        System.out.println(addStrings("6994", "36"));
    }

    public static String addStrings(String num1, String num2) {

        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);

        int minLength = Math.min(num1.length(), num2.length());
        int maxLength = Math.max(num1.length(), num2.length());

        String s1 = sb1.reverse().toString();
        String s2 = sb2.reverse().toString();

        StringBuilder result = new StringBuilder();

        int um = 0;

        for (int i = 0; i < minLength; i++) {

            int f = getParseInt(s1, i);
            int g = getParseInt(s2, i);

            int sum = f + g;

            if (um > 0) {
                sum += 1;
                um--;
            }

            if (sum > 9) {
                result.append(sum % 10);
                um++;
            } else {
                result.append(sum);
            }
        }

        if (num1.length() > num2.length()) {
            for (int i = minLength; i < maxLength; i++) {
                if (um > 0) {
                    if (getParseInt(s1, i) == 9) {
                        result.append(0);
                    } else {
                        result.append(getParseInt(s1, i) + 1);
                        um--;
                    }
                } else {
                    result.append(s1.charAt(i));
                }
            }
        } else if (num1.length() < num2.length()) {
            for (int i = minLength; i < maxLength; i++) {
                if (um > 0) {
                    if (getParseInt(s2, i) == 9) {
                        result.append(0);
                        um++;
                    } else {
                        result.append(getParseInt(s2, i) + 1);
                        um--;
                    }
                } else {
                    result.append(s2.charAt(i));
                }
            }
        }

        if (um > 0) {
            result.append(1);
        }

        return result.reverse().toString();
    }

    private static int getParseInt(String s, int i) {
        return Integer.parseInt(Character.toString(s.charAt(i)));
    }
}
