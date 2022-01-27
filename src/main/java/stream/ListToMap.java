package stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
  public static Map<String, Student> convert(List<Student> list) {
   Map<String, Student> mapStudent = list.stream()
       .collect(Collectors.toMap(
           strudent -> strudent.getSurname(),
           student -> student,
           (existing, replacement) -> existing
       ));
    return mapStudent;

  }
}
