package problems;

public class Problem345 {

    public static void main(String[] args) {

        System.out.println(reverseVowels("aA"));
    }

    public static String reverseVowels(String s) {

        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'a'|| c[i] == 'e'|| c[i] == 'i'|| c[i] == 'o' || c[i] =='u'
                    || c[i] == 'A'|| c[i] == 'E'|| c[i] == 'I'|| c[i] == 'O' || c[i] =='U'){
                sb.append(c[i]);

                c[i] = 0;
            }
        }

        String s1 = sb.reverse().toString();

        int a = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0){
                c[i] = s1.charAt(a);
                a++;
            }
        }

        StringBuilder sb1 = new StringBuilder();

        for (char value : c) {
            sb1.append(value);
        }

        return sb1.toString();
    }
}
