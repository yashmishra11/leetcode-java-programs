import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll().getKey());
        }
    }
}