import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(List.of("test", "tes", "TEST", "test", "teS", "TESt", "tes"));
        task4(List.of("test", "tes", "TEST", "test", "teS", "TESt", "tes"));
    }

    public static void task1(List<Integer> numbers) {
        System.out.println("Task 1");
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
        System.out.println();

    }

    public static void task2(List<Integer> numbers) {
        System.out.println("Task 2");
        Set<Integer> set = new TreeSet<>(numbers);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        System.out.println();
    }

    public static void task3(List<String> words) {
        System.out.println("Task 3");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else
                map.put(word, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
    }

    public static void task4(List<String> words) {
        System.out.println("Task 4");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else
                map.put(word, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " Встречаеться " + entry.getValue() + "  раза");
        }
        System.out.println();
    }
}