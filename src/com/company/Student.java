package com.company;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private int course;


    public Student(String name, String surname, String patronymic, int age, int course) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ім'я студента: '" + name + '\'' +
                ", прізвище студента: '" + surname + '\'' +
                ", по батькові студента: '" + patronymic + '\'' +
                ", вік студента: " + age +
                ", курс студента: " + course +
                '}';
    }
}
