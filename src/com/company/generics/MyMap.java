package com.company.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<k, v> implements Map {
    k[] keys;
    v[] values;
    int size;
    private int index = -1;

    public MyMap(int size) {
        this.size = size;
        keys = (k[]) new Object[size];
        values = (v[]) new Object[size];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        for (int i=0;i<this.size;++i){
           if (keys[i] == key)
               return values[i];
        }
        return "Not Found!";
    }

    @Override
    public Object put(Object key, Object value) {
        index++;
        keys[index] = (k) key;
        values[index] = (v) value;
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {
    }

    @Override
    public void clear() {
        index=-1;
    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return Arrays.asList(values);
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
