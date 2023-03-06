package model;

import java.util.List;

public interface DB {
    List<Person> getList();

    int createPersonRow(Person person);
}