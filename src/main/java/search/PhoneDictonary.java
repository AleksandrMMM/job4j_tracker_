package search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneDictonary {

    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        List<Person> result;
      result = persons.stream().filter(value -> value.getName().contains(key) || value.getPhone().contains(key) ||
                value.getAddress().contains(key) || value.getSurname().contains(key)).collect(Collectors.toList());

        return result;

    }
}
