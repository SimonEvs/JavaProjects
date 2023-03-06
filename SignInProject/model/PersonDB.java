package model;

import java.util.ArrayList;
import java.util.List;

public class PersonDB implements DB {
    private int lastId;
    private List<Person> list;

    public PersonDB() {
        lastId = 0;
        list = new ArrayList<>();
        createPersonRow(new Person("Test1", "1234"));
        createPersonRow(new Person("Test2", "235"));
        createPersonRow(new Person("Test3", "777"));
        createPersonRow(new Person("Test4", "666"));
    }

    public List<Person> getList() {
        return list;
    }

    public int createPersonRow(Person person) {
        person.setId(lastId++);
        list.add(person);
        return 1;
    }
}