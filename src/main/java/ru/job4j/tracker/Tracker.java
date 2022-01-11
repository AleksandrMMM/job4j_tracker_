package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {

        return items.get(id);
    }

    public List<Item> findAll() {
        return items;

    }

    public List<Item> findByName(String key) {
        List<Item> copyName = new ArrayList<>();
        for (Item item: items) {
            if (item.getName().equals(key)) {
                copyName.add(item);
            }
        }
        return copyName;

    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items.get(i).getId() == id) {
                rsl = i;
                break;
            }

        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items.set(index, item);
        }
        return result;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }

        return rsl;

    }

}

