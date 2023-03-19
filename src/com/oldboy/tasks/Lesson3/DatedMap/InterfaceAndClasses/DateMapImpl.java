package com.oldboy.tasks.Lesson3.DatedMap.InterfaceAndClasses;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DateMapImpl implements DatedMap{
    private Map<String,String> dateMap = new HashMap<>();
    private Map<String,Date> getDateKey = new HashMap<>();
    @Override
    public void put(String key, String value) {
        dateMap.put(key,value);
        Date date = new Date();
        getDateKey.put(key,date);
    }

    @Override
    public String get(String key) {
        return dateMap.get(key);
    }

    @Override
    public boolean containsKey(String key) {
        return dateMap.containsKey(key);
    }

    @Override
    public void remove(String key) {
        dateMap.remove(key);
        getDateKey.remove(key);
    }

    @Override
    public Set<String> keySet() {
        return dateMap.keySet();
    }

    @Override
    public Date getKeyLastInsertionDate(String key) {
        if (getDateKey.containsKey(key)){
            return getDateKey.get(key);
        }
            return null;
    }
}
