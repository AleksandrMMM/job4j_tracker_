package ex;

import java.util.Arrays;

public class BackArray {

    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length/ 2;
        for (int index = 1; index <= middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index];
            names[names.length - index] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
