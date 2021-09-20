package ru.job4j.tracker;

public class ReplaceItem implements UserAction {

    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean rslt = true;
        int id = input.askInt("Enter id: ");
        String name = input.askString("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        }else {
            System.out.println("Ошибка замены заявки.");
            rslt = false;
        }
        return rslt;
    }
}
