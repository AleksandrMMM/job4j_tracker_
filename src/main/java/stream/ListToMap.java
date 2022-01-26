package stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
  public static Map<String, Student> convert(List<Student> list) {
   Map<String, Student> studentMap = list.stream()
       .distinct()
       .collect(Collectors.toMap(
            value -> value.getSurname(),
            value -> value
        ), Function.identity());
    return new LinkedHashMap<>();
  }
}
