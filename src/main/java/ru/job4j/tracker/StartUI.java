package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {

    private final Output out;
    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] userActions) {
        boolean run = true;
        while (run) {
            this.showMenu(userActions);
            int select = input.askInt("Select: ");
            UserAction userAction = userActions[select];
            run = userAction.execute(input, tracker);
        }


    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu: ");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name());
        }

    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateItem(),
                new CreateAction(output),
                new DeleteItem(),
                new FindAllItem(),
                new FindByNameItem(),
                new FindByIdItem(),
                new Exit()
        };
        new StartUI(output).init(input, tracker, actions);
    }

}
