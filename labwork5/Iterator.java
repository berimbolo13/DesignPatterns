package com.lab111.labwork5;

public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
    Object current();
    void tour();
    void setNameFilter(String nameFilter);
    void setGenderFilter(String genderFilter);
    void setAgeFilter(int ageFilter);
    void setCityFilter(String cityFilter);
}
