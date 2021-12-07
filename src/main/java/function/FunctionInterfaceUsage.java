package function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "New String For Interface";
        System.out.println(sup.get());

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup2 = () -> new HashSet<>(list);
        Set<String> strings = sup2.get();
        strings.stream().forEach(System.out::println);

        Supplier<String> sup3 = () -> "New String For Interface";
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept(sup.get());

        // Перепишем пример на применение BiConsumer

        Supplier<String> sup4 = () -> "New String For Interface";
        BiConsumer<String, String> consumer2 = (s, s1) -> System.out.println(s + s1);
        consumer2.accept(sup.get(), " and Second String");

    }
}
