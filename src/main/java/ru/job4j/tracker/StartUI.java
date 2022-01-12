package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartUI {

    private final Output out;
    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> userActions) {
        boolean run = true;
        while (run) {
            this.showMenu(userActions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= userActions.size()) {
                System.out.println("Wrong input, you can select: 0 .. " + (userActions.size() - 1));
                continue;
            }
            UserAction userAction = userActions.get(select);
            run = userAction.execute(input, tracker);

        }



    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu: ");
        for (int i = 0; i < actions.size(); i++) {
            out.println(i + ". " + actions.get(i).name());
        }

    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>(List.of(new CreateItem(),
                new CreateAction(output),
                new DeleteItem(),
                new FindAllItem(),
                new FindByNameItem(),
                new FindByIdItem(),
                new Exit()));

        new StartUI(output).init(input, tracker, actions);
    }

}
