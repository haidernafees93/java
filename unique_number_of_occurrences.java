import java.util.HashMap;
import java.util.HashSet;

public class unique_number_of_occurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        int length = arr.length;
        HashMap<Integer, Integer> listA = new HashMap<>();
        HashSet<Integer> listB = new HashSet<>();

        for (int i = 0; i < length; i++) {
            if (!listA.containsKey(arr[i])) {
                listA.put(arr[i], 1);
            } else {
                listA.put(arr[i], listA.get(arr[i]) + 1);
            }
        }

        for (Integer i : listA.values()) {
            if (!listB.contains(i)) {
                listB.add(i);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 1, 1, 3 };
        boolean result = uniqueOccurrences(arr);
        System.out.println("The result is: " + result);
    }
}