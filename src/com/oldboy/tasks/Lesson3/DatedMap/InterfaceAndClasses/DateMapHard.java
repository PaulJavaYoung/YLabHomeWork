package com.oldboy.tasks.Lesson3.DatedMap.InterfaceAndClasses;

import java.util.*;

public class DateMapHard implements DatedMap {

    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private Entry[] array = new Entry[INITIAL_CAPACITY];
    private int size = 0;
    private Map<String, Date> getDateKey = new HashMap<>();

    @Override
    public void put(String key, String value) {

        if (size >= (array.length * LOAD_FACTOR)) {
            increaseArray();
        }

        boolean put = put(key, value, array);
        if (put) {
            size++;
        }
    }

    private boolean put(String key, String value, Entry[] dst) {
        int position = getElementPosition(key, dst.length);
        Entry existedElement = dst[position];
        if (existedElement == null) {
            Entry entry = new Entry(key, value, null);
            dst[position] = entry;
            Date date = new Date();
            getDateKey.put(key, date);
            return true;
        } else {
            while (true) {
                if (existedElement.key.equals(key)) {
                    existedElement.value = value;
                    Date date = new Date();
                    getDateKey.put(key, date);
                    return false;
                }
                if (existedElement.next == null) {
                    existedElement.next = new Entry(key, value, null);
                    Date date = new Date();
                    getDateKey.put(key, date);
                    return true;
                }
                existedElement = existedElement.next;
            }
        }
    }

    @Override
    public String get(String key) {
        int position = getElementPosition(key, array.length);
        Entry existedElement = array[position];
        while (existedElement != null) {
            if (existedElement.key.equals(key)) {
                return existedElement.value;
            }
            existedElement = existedElement.next;
        }
        return null;
    }

    @Override
    public Set<String> keySet() {
        Set<String> result = new HashSet<>();
        for (Entry entry : array) {
            Entry existedElement = entry;
            while (existedElement != null) {
                result.add(existedElement.key);
                existedElement = existedElement.next;
            }
        }
        return result;
    }

    @Override
    public boolean containsKey(String key) {
        int position = getElementPosition(key, array.length);
        Entry existedElement = array[position];
        if (existedElement != null && existedElement.key.equals(key)) {
            return true;
        }
        return false;
    }

    @Override
    public void remove(String key) {
        int position = getElementPosition(key, array.length);
        Entry existedElement = array[position];
        if (existedElement != null && existedElement.key.equals(key)) {
            array[position] = existedElement.next;
            getDateKey.remove(key);
            size--;
        } else {
            while (existedElement != null) {
                Entry nextElement = existedElement.next;
                if (nextElement == null) {
                }
                if (nextElement.key.equals(key)) {
                    existedElement.next = nextElement.next;
                    getDateKey.remove(key);
                    size--;
                }
                existedElement = existedElement.next;
            }
        }
    }

    @Override
    public Date getKeyLastInsertionDate(String key) {
        if (getDateKey.containsKey(key)) {
            return getDateKey.get(key);
        }
        return null;
    }

    private int getElementPosition(String str, int arrayLength) {
        return Math.abs(str.hashCode() % arrayLength);
    }

    private void increaseArray() {
        Entry[] newArray = new Entry[array.length * 2];
        for (Entry entry : array) {
            Entry existedElement = entry;
            while (existedElement != null) {
                put(existedElement.key, existedElement.value, newArray);
                existedElement = existedElement.next;
            }
        }
        array = newArray;
    }

    private static class Entry {
        private String key;
        private String value;
        private Entry next;

        public Entry(String key, String value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
