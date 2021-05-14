package com.company;

import java.io.IOException;

public class StudentTester {
    public static void main(String[] args) throws IOException {
        Student[] students = new Student[0];
        Student[] studentsHelper = new Student[0];
        while (true) {
            System.out.print("Введіть ім'я студента: ");
            String name = DataInput.getString();
            for (int i = 0; i < name.length(); i++) {
                if (!((name.charAt(i) >= 65 && name.charAt(i) <= 90) || (name.charAt(i) >= 97 && name.charAt(i) <= 122))) {
                    System.out.print("Введіть ім'я студента використовуючи тільки літери англійського алфавіту: ");
                    name = DataInput.getString();
                    i = -1;
                }
            }
            System.out.print("Введіть прізвище студента: ");
            String surname = DataInput.getString();
            for (int i = 0; i < name.length(); i++) {
                if (!((surname.charAt(i) >= 65 && surname.charAt(i) <= 90) || (surname.charAt(i) >= 97 && surname.charAt(i) <= 122))) {
                    System.out.print("Введіть прізвище студента використовуючи тільки літери англійського алфавіту: ");
                    surname = DataInput.getString();
                    i = -1;
                }
            }
            System.out.print("Введіть по батькові студента: ");
            String patronymic = DataInput.getString();
            for (int i = 0; i < name.length(); i++) {
                if (!((patronymic.charAt(i) >= 65 && patronymic.charAt(i) <= 90) || (patronymic.charAt(i) >= 97 && patronymic.charAt(i) <= 122))) {
                    System.out.print("Введіть по батькові студента використовуючи тільки літери англійського алфавіту: ");
                    patronymic = DataInput.getString();
                    i = -1;
                }
            }
            System.out.print("Введіть вік студента: ");
            int age = DataInput.getInt();
            System.out.print("Введіть курс студента: ");
            int course = DataInput.getInt();
            studentsHelper = students;
            students = new Student[students.length + 1];
            students[students.length - 1] = new Student(name, surname, patronymic, age, course);
            for (int i = 0; i < studentsHelper.length; i++) {
                students[i] = studentsHelper[i];
            }

            //продовжати чи ні
            System.out.print("Введіть 1 якщо бажаєте продовжити вводити студентів або інше число якщо бажаєте припинити: ");
            int ifWant = DataInput.getInt();
            if (ifWant != 1) {
                break;
            }
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        System.out.print("Введіть першу літеру прізвища студентів яких хочете знайти(якщо введете декілька символів, програма візьме тільки 1 букву): ");
        char firstLetterSurname = DataInput.getChar();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getSurname().charAt(0) == firstLetterSurname) {
                System.out.println(students[i].toString());
            }
        }
    }
}
