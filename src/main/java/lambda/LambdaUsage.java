package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaadsfdfd");
        list.add("aaafsdfdfdfd");
        list.add("aaafdsfd");
        System.out.println("До сортировки " + list);
        Comparator<String> cmpDescSize = (right, left) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return Integer.compare(right.length(), left.length());
        };
        list.sort(cmpDescSize);
        System.out.println("После сортировки: " + list);

        String[] names = {
                "Ivan",
                "Petr"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthCmp);
    }
}
