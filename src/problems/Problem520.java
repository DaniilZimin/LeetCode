package problems;

public class Problem520 {

    public static void main(String[] args) {

        System.out.println(detectCapitalUse("WWWD"));
    }

    public static boolean detectCapitalUse(String word) {

        char s = word.charAt(0);

        if (Character.isUpperCase(s)){
            if(word.length() > 1 && Character.isUpperCase(word.charAt(1))){
                for (int i = 1; i < word.length(); i++) {
                    if(!Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }else {
                for (int i = 1; i < word.length(); i++) {
                    if(Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }
            return true;
        }

        if(!Character.isUpperCase(s)){
            for (int i = 1; i < word.length(); i++) {
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }

        return true;

    }
}
