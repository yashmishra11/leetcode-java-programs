import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 2, 3, 3, 3 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > arr.length / 2) {
                System.out.println("Majority: " + num);
                break;
            }
        }
    }
}