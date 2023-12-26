import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Tạo danh sách
        Integer[] arr = {1, 2, 3, 1, 2, 4, 5, 6, 4, 3, 7};

        // Tạo HashSet từ danh sách
        Set<Integer> uniqueSet = new HashSet<>();
        for (Integer num : arr) {
            uniqueSet.add(num);
        }

        // In ra các phần tử trong set
        System.out.println("Set:");
        System.out.println(uniqueSet);

        // In ra số lượng phần tử duy nhất
        System.out.println("Số lượng phần tử duy nhất trong set: " + uniqueSet.size());
    }
}