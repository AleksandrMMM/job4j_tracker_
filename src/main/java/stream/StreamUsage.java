package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", spent=" + spent +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>(List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        ));

        List<Task> tasks = List.of(
                new Task("Bug #1", 10),
                new Task("Task #2", 20),
                new Task("Bug #3", 40)
        );

        List<Task> bugs = taskList.stream().filter( x -> x.name.contains("Bug")).collect(Collectors.toList());
        bugs.forEach(System.out::println);

        List<String> task = taskList.stream().map(x -> x.name).collect(Collectors.toList());
        task.forEach(System.out::println);

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, -4, 5, 6, -7, 12, 34));
        List<Integer> listNew = integerList.stream().filter(x -> x > 0).collect(Collectors.toList());
        listNew.forEach(System.out::println);

        tasks.stream()
                .filter(t -> t.name.contains("Bug"))
                .filter(t -> t.spent > 30)
                .map(t -> t.name + " " + t.spent)
                .forEach(System.out::println);


    }

}
