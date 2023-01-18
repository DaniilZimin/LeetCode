package problems;

import java.util.*;

public class Problem506 {
    public static void main(String[] args) {

        int[] score = {3, 6, 10, 5, 7, 12};

        System.out.println(Arrays.toString(findRelativeRanks(score)));


    }

    public static String[] findRelativeRanks(int[] score) {

        Map<Integer, String> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        for (int i : score) {
            list.add(i);
        }

        Collections.sort(list);
        Collections.reverse(list);


        for (int i = 0; i < score.length; i++) {
            if(i == 0){
                map.put(list.get(i), "Gold Medal");
            } else if (i == 1) {
                map.put(list.get(i), "Silver Medal");
            } else if (i == 2) {
                map.put(list.get(i), "Bronze Medal");
            }else {
                map.put(list.get(i), String.valueOf(i + 1));
            }

        }

        String [] result = new String[score.length];


        for (int i = 0; i < score.length; i++) {

            result[i] = map.get(score[i]);

        }

        return  result;

    }
}
