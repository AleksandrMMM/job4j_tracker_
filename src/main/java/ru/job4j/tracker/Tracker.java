package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }


    public Item[] findAll(Item[] item) {
        Item[] ItemWithoutNull = new Item[item.length];
        for (int index = 0; index < item.length; index++) {
            Item itemNot = item[index];
            if (itemNot != null) {
                ItemWithoutNull[size] = itemNot;
                size++;
            }
        }
        ItemWithoutNull = Arrays.copyOf(ItemWithoutNull, size);
        return ItemWithoutNull;

    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] itemsFindName = new Item[items.length];
        for (int i = 0; i < this.items.length; i++) {
            if (items[i] != null) {
                if (items[i].getName().equals(key)) {
                    itemsFindName[i] = items[i];
                    count++;
                }
            }
        }
        itemsFindName = Arrays.copyOf(itemsFindName, count);
        return itemsFindName;

    }

 }