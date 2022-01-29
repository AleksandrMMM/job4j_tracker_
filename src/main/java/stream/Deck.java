package stream;

import java.util.stream.Stream;

public class Deck {
    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(sv -> Stream.of(Value.values()))
                .map(value -> new Card(sv, value))
                .forEach(System.out::println);
    }
}
