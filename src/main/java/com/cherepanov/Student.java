package com.cherepanov;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String gender;
    private Room room;

    public Student(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sendRequest(String requestText) {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Room getRoom() {
        return room;
    }
}