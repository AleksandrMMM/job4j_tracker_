package collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        list.forEach(numb -> numbers.add(numb.getNumber()));
        return numbers;
    }
}
