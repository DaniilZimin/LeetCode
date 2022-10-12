package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem434 {

    public static void main(String[] args) {

        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public static int countSegments(String s) {

        if (s.equals("")) {
            return 0;
        }

        String[] res = s.split(" ");

        List<String> list = new ArrayList<>();

        for (String re : res) {
            if (!re.equals("")) {
                list.add(re);
            }
        }

        return list.size();
    }
}
