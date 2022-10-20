package problems;

import java.util.*;

public class Problem599 {

    public static void main(String[] args) {

        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        System.out.println(Arrays.toString(findRestaurant(list1, list2)));

    }

    public static String[] findRestaurant(String[] list1, String[] list2) {

        List<String> list = new ArrayList<>(Arrays.asList(list2));

        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < list1.length; i++) {

            if (list.contains(list1[i])) {
                int a = list.indexOf(list1[i]);

                map.put(list1[i], i + a);
            }
        }

        int min = map.values().stream().min(Integer::compareTo).orElseThrow();

        List<String> ress = new ArrayList<>();

        for (Map.Entry<String, Integer> mapa : map.entrySet()) {

            if (mapa.getValue() == min) {
                ress.add(mapa.getKey());
            }
        }

        return ress.toArray(new String[0]);
    }
}