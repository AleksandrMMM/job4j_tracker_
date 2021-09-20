package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean rslt = true;
        int id = input.askInt("Введите id удаляемой Заявки: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        }else {
            System.out.println("Ошибка удаления заявки.");
            rslt = false;
        }

        return rslt;
    }
}
