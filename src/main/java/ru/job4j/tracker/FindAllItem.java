package ru.job4j.tracker;

public class FindAllItem implements UserAction {

    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean rsl = true;
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item it: items) {
                System.out.println(it);
            }
        }else {
            System.out.println("Хранилище еще не содержит заявок");
            rsl = false;
        }
        return rsl;
    }
}
