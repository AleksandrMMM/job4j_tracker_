package io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("игра 11");
        boolean turn = true;
        int count = 11;
        while(count > 0) {
            String player = turn ? "первый игрок" : "второй игорок";
            System.out.println(player + " введите число от 1 до 3");
            boolean run = true;
            int matches = 0;
            while (run) {
                matches = Integer.parseInt(input.nextLine());
                if (matches >= 1 && matches <= 3 ) {
                    run = false;
                }else {
                    System.out.println("Введите число от 1 до 3");
                }
            }
            turn = !turn;
            count = count - matches;
            System.out.println("количество спичек " + count);
            if (count <= 0) {
                System.out.println("выиграл " + player);
                break;
            }
        }
    }
}
