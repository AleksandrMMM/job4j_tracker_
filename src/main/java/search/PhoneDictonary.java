package search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictonary {

    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        List<Person> result = new  ArrayList<>();
        for (Person person: persons) {
            if (person.getName().contains(key)) {
                result.add(person);
            } else  if (person.getPhone().contains(key)) {
                result.add(person);
            }else if(person.getAddress().contains(key)) {
                result.add(person);
            }else if(person.getSurname().contains(key)) {
                result.add(person);
            }
        }
        return result;

    }
}
