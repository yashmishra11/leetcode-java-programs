import java.util.*;

public class SubarraySumK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Count: " + count);
    }
}