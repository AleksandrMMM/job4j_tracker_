package ru.job4j.tracker;

public class FindByIdItem implements UserAction {

    @Override
    public String name() {
        return "=== Find item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {

        int id = input.askInt("Введите id Заявки, которую необходимо найти ");
        Item item = tracker.findById(id);
        if (item != null) {

            System.out.println(item);

        }else {

            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return false;
    }
}
