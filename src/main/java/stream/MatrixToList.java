package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    public static List<Integer> convert(Integer[][] matrix) {
       List<Integer> list = Arrays.stream(matrix)
                .flatMap(n -> Arrays.stream(n))
                .collect(Collectors.toList());

        return list;
    }
 }

