package com.lab111.labwork5;

public interface Aggregate {
    Iterator getStraightIterator();
    Iterator getBackIterator();
    void addRecord(Record record);
    void removeRecord(int i);
}
