package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ItemAscByNameTest {

    @Test
    public void sortByNameUp() {
        Item item1 = new Item(1, "a");
        Item item2 = new Item(2, "b");
        Item item3 = new Item(3, "c");
        List<Item> rsl = Arrays.asList(item2, item1, item3);
        List<Item> expected = Arrays.asList(item1, item2, item3);
        Collections.sort(rsl, new ItemAscByName());
        assertThat(rsl, is(expected));
    }

    @Test
    public void sortByNameDown() {
        Item item1 = new Item(1, "a");
        Item item2 = new Item(2, "b");
        Item item3 = new Item(3, "c");
        List<Item> rsl = Arrays.asList(item2, item1, item3);
        List<Item> expected = Arrays.asList(item3, item2, item1);
        Collections.sort(rsl, new ItemDescByName());
        assertThat(rsl, is(expected));
    }
}