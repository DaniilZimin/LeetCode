package problems;

public class Problem67 {
    public static void main(String[] args) {

        System.out.println(addBinary("1010",
                "1011"));
    }

    public static String addBinary(String a, String b) {

        char[] ac = new StringBuilder(a).reverse().toString().toCharArray();
        char[] bc = new StringBuilder(b).reverse().toString().toCharArray();

        int maxLength;
        int minLength;

        if (ac.length > bc.length) {
            maxLength = ac.length;
            minLength = bc.length;
        } else {
            maxLength = bc.length;
            minLength = ac.length;
        }

        StringBuilder sb = new StringBuilder();

        int um = 0;

        for (int i = 0; i < minLength; i++) {
            if (ac[i] == '1' && bc[i] == '1') {
                if (um > 0) {
                    sb.append("1");
                } else {
                    sb.append("0");
                    um++;
                }
            } else if (ac[i] == '0' && bc[i] == '1') {
                if (um > 0) {
                    sb.append("0");
                } else {
                    sb.append("1");
                }
            } else if (ac[i] == '1' && bc[i] == '0') {
                if (um > 0) {
                    sb.append("0");
                } else {
                    sb.append("1");
                }
            } else if (ac[i] == '0' && bc[i] == '0') {
                if (um > 0) {
                    sb.append("1");
                    um--;
                } else {
                    sb.append("0");
                }
            }
        }

        System.out.println(sb);
        if (ac.length > bc.length) {
            for (int j = minLength; j < maxLength; j++) {
                if (ac[j] == '1' && um > 0) {
                    sb.append("0");

                } else if (ac[j] == '0' && um > 0) {
                    sb.append('1');
                    um--;
                } else {
                    sb.append(ac[j]);
                }
            }
        } else {
            for (int j = minLength; j < maxLength; j++) {
                if (bc[j] == '1' && um > 0) {
                    sb.append("0");

                } else if (bc[j] == '0' && um > 0) {
                    sb.append('1');
                    um--;
                } else {
                    sb.append(bc[j]);
                }
            }
        }

        while (um > 0) {
            sb.append("1");
            um--;
        }
        return sb.reverse().toString();
    }
}
