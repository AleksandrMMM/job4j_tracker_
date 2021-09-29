package collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Петр");
        list.add("Stepan");
        list.add("Ivan");

        for (String  s: list) {
            System.out.println(s);
        }
    }
}
