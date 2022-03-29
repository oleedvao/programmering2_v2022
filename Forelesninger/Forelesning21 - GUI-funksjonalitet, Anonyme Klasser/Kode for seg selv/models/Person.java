package no.hiof.oleedvao.forelesning21.models;

public class Person {

    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    //Ctrl + o

    @Override
    public String toString() {
        return "Full name: " + fullName + ", age: " + age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
