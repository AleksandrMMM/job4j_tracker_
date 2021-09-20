package ru.job4j.tracker;

import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateItem(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item items = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[]{"0", String.valueOf(items.getId()), replacedName, "1"});
        UserAction[] actions = {
                new ReplaceItem(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(items.getId()).getName(), is(replacedName));

    }
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item items = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(new String[]{"0", String.valueOf(items.getId()), "1"});
        UserAction[] actions = {
                new DeleteItem(),
                new Exit()
        };

        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(items.getId()), is(nullValue()));
    }
}