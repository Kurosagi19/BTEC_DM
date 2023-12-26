import java.util.HashMap;
import java.util.Map;

public class MultiSet {
    public static void main(String[] args) {
        // Tạo danh sách
        Integer[] arr = {1, 2, 3, 1, 2, 4, 5, 6, 4, 3, 7};

        // Tạo HashMap (tương đương với Multiset) từ danh sách
        Map<Integer, Integer> multisetMap = new HashMap<>();
        for (Integer num : arr) {
            multisetMap.put(num, multisetMap.getOrDefault(num, 0) + 1);
        }

        // In ra multiset (HashMap)
        System.out.println("Multiset (HashMap):");
        System.out.println(multisetMap);

        // In ra số lượng phần tử duy nhất và số lần xuất hiện
        for (Map.Entry<Integer, Integer> entry : multisetMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " lần");
        }
    }
}
