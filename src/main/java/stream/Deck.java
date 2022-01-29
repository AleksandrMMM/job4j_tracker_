package stream;

import java.util.stream.Stream;

public class Deck {
    Suit[] levels = Suit.values();
    Value[] tasks = Value.values();
    public static void main(String[] args) {
        Suit[] levels = Suit.values();
        Value[] tasks = Value.values();
        Stream.of(Suit.values())
                .flatMap(level -> Stream.of(Value.values())
                        .map(task -> new Card(level, task)))
                .forEach(System.out::println);
    }
}
