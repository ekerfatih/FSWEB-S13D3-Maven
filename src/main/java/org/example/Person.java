package org.example;

public class Person {
    String _firsName;
    String _lastName;
    int _age;
    String education;
    boolean isMarried;
    boolean isWorking;


    public Person(String firsName) {
        _firsName = firsName;
    }

    public Person(String firsName, String lastName) {
        this(firsName);
        _lastName = lastName;
    }

    public Person(String firsName, String lastName, int age) {
        this(firsName,lastName);
        _age = age;
    }

    public String getFirstName() {
        return _firsName;
    }
    public String getLastName() {
        return _lastName;
    }

    public int getAge(){
        return _age;
    }

    public boolean isTeen(){
        return _age >= 13 && _age <= 19;
    }


}
