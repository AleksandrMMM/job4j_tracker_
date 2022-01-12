package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>(List.of(new CreateItem(), new Exit()));
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        Item items = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[]{"0", String.valueOf(items.getId()), replacedName, "1"});
        List<UserAction> actions = new ArrayList(List.of(new ReplaceItem(), new Exit()));
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(items.getId()).getName(), is(replacedName));

    }
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        Item items = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(new String[]{"0", String.valueOf(items.getId()), "1"});
        List<UserAction> actions = new ArrayList<>(List.of(new DeleteItem(), new Exit()));

        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(items.getId()), is(nullValue()));
    }
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>(List.of(new Exit()));

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu: " + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }
}