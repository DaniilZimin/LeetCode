package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem500 {
    public static void main(String[] args) {

        String [] result = {"Hello","Alaska","Dad","Peace"};

        System.out.println(Arrays.toString(findWords(result)));

    }

    public static String[] findWords(String[] words) {

        List<String> list = new ArrayList<>();

        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl0";
        String str3 = "zxcvbnm";

        for (String word : words) {

            if (str1.contains(word.toLowerCase().substring(0, 1))) {

                boolean b = true;
                for (int j = 0; j < word.length(); j++) {
                    if (!str1.contains(word.toLowerCase().substring(j, j + 1))) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    list.add(word);
                }
            }

            if (str2.contains(word.toLowerCase().substring(0, 1))) {


                boolean b = true;
                for (int j = 0; j < word.length(); j++) {
                    if (!str2.contains(word.toLowerCase().substring(j, j + 1))) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    list.add(word);
                }
            }

            if (str3.contains(word.toLowerCase().substring(0, 1))) {

                boolean b = true;
                for (int j = 0; j < word.length(); j++) {
                    if (!str3.contains(word.toLowerCase().substring(j, j + 1))) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    list.add(word);
                }
            }
        }

        String [] result = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
