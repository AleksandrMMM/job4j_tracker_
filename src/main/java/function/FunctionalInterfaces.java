package function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (s1, s2) -> map.put(s1, s2);
        biCon.accept(1, "one");
        BiPredicate<Integer, String> biPred = (s1, s2) -> s1 % 2 == 0 || s2.length() == 4;
        for (Integer i : map.keySet()) {

            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        Consumer<String> con = s -> System.out.println(s);
        Function<String, String> func = (s) -> s.toUpperCase();
        for (String s : sup.get()) {

            con.accept(func.apply(s));
            System.out.println(s.toUpperCase());
        }
    }
}
