package com.lab111.labwork5;

import java.util.ArrayList;

public class Table implements Aggregate{
    private ArrayList<Record> table = new ArrayList<>();

    @Override
    public void addRecord(Record record) {
        table.add(record);
    }

    @Override
    public void removeRecord(int i) {
        table.remove(i);
    }

    @Override
    public Iterator getStraightIterator() {
        return new straightIterator();
    }

    @Override
    public Iterator getBackIterator() {
        return new backIterator();
    }

    private class straightIterator implements Iterator {
        private int index = 0;
        private String nameFilter, genderFilter, cityFilter;
        private int ageFilter;

        @Override
        public void setNameFilter(String nameFilter) {
            this.nameFilter = nameFilter;
        }

        @Override
        public void setGenderFilter(String genderFilter) {
            this.genderFilter = genderFilter;
        }

        @Override
        public void setCityFilter(String cityFilter) {
            this.cityFilter = cityFilter;
        }

        @Override
        public void setAgeFilter(int ageFilter) {
            this.ageFilter = ageFilter;
        }

        @Override
        public Object first() {
            index = 0;
            return table.get(index);
        }

        @Override
        public Object next() {
            return table.get(index++);
        }

        @Override
        public boolean hasNext() {
            if (index < table.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object current() {
            return table.get(index);
        }

        @Override
        public void tour() {
            if (nameFilter == null && ageFilter == 0 && genderFilter == null && cityFilter == null) {
                while (this.hasNext()) {
                    System.out.println(this.next());
                }
            } else {
                while (this.hasNext()) {
                    Record next = (Record)this.next();
                    if (nameFilter != null && nameFilter != next.getName()){
                        continue;
                    }
                    if (ageFilter != 0 && ageFilter != next.getAge()){
                        continue;
                    }
                    if (cityFilter != null && cityFilter != next.getCity()){
                        continue;
                    }
                    if (genderFilter != null && genderFilter != next.getGender()){
                        continue;
                    }

                    System.out.println(next);
                }
            }
        }
    }

    private class backIterator implements Iterator{
        private int index = table.size()-1;
        private String nameFilter, genderFilter, cityFilter;
        private int ageFilter;

        @Override
        public void setNameFilter(String nameFilter) {
            this.nameFilter = nameFilter;
        }

        @Override
        public void setGenderFilter(String genderFilter) {
            this.genderFilter = genderFilter;
        }

        @Override
        public void setCityFilter(String cityFilter) {
            this.cityFilter = cityFilter;
        }

        @Override
        public void setAgeFilter(int ageFilter) {
            this.ageFilter = ageFilter;
        }

        @Override
        public Object first() {
            index = table.size()-1;
            return table.get(index);
        }

        @Override
        public Object next() {
            return table.get(index--);
        }

        @Override
        public boolean hasNext() {
            if (index >= 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object current() {
            return table.get(index);
        }

        @Override
        public void tour() {
            if (nameFilter == null && ageFilter == 0 && genderFilter == null && cityFilter == null) {
                while (this.hasNext()) {
                    System.out.println(this.next());
                }
            } else {
                while (this.hasNext()) {
                    Record next = (Record)this.next();
                    if (nameFilter != null && nameFilter != next.getName()){
                        continue;
                    }
                    if (ageFilter != 0 && ageFilter != next.getAge()){
                        continue;
                    }
                    if (cityFilter != null && cityFilter != next.getCity()){
                        continue;
                    }
                    if (genderFilter != null && genderFilter != next.getGender()){
                        continue;
                    }

                    System.out.println(next);
                }
            }
        }
    }
}
