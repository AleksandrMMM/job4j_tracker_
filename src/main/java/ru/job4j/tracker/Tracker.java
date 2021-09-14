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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);

    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] result = new Item[items.length];
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                    result[count] = items[i];
                    count++;
                }

        }
        result = Arrays.copyOf(result, count);
        return result;

    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }

        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        if (indexOf(id) == -1) {
            return false;
        }
        item.setId(id);
        items[indexOf(id)] = item;
        return true;
    }

    public boolean delete(int id) {
       boolean rsl = false;
       int index = indexOf(id);
       int start = index + 1;
       int distPos = index;
       int size2 = size - index;
       if (index != -1) {
           System.arraycopy(items, start, items, distPos, size2);
           items[size2 - 1] = null;
           size2--;
           rsl = true;
       }
       return rsl;
    }
}

