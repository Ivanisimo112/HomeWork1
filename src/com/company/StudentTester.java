package com.company;

import java.io.IOException;

public class StudentTester {
    public static void main(String[] args) throws IOException {
        Student[][] students1 = new Student[26][];
        Student[] students = new Student[0];
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student[0];
        }


        while (true) {
            String name = checkString("ім'я");
            String surname = checkString("прізвище");
            String patronymic = checkString("по батькові");
            System.out.print("Введіть вік студента: ");
            int age = DataInput.getInt();
            System.out.print("Введіть курс студента: ");
            int course = DataInput.getInt();
            Student newStudent = new Student(name, surname, patronymic, age, course);

            addStudentByFirstLetter(newStudent, students1);

            students=addInArray(students, newStudent);

            //продовжати чи ні
            System.out.print("Введіть 1 якщо бажаєте продовжити вводити студентів або інше число якщо бажаєте припинити: ");
            int ifWant = DataInput.getInt();
            if (ifWant != 1) {
                break;
            }
        }
        sout(students);
        enteringTheFirstLetter(students1);
    }

    private static Student[] expandStudentArray(Student[] students) {
        Student[] temp = students;
        students = new Student[students.length + 1];
        for (int i = 0; i < temp.length; i++) {
            students[i] = temp[i];
        }
        return students;
    }

    private static void addStudentByFirstLetter(Student student, Student[][] students) {
        Student[] studentsWithFirstLetter = students[student.getSurname().charAt(0) - 65];
        studentsWithFirstLetter = expandStudentArray(studentsWithFirstLetter);
        studentsWithFirstLetter[studentsWithFirstLetter.length - 1] = student;
        students[student.getSurname().charAt(0) - 65] = studentsWithFirstLetter;
    }

    private static String checkString(String s) throws IOException {
        System.out.print("Введіть " + s + " студента: ");
        String name = DataInput.getString();
        for (int i = 0; i < name.length(); i++) {
            if (!((name.charAt(i) >= 65 && name.charAt(i) <= 90) || (name.charAt(i) >= 97 && name.charAt(i) <= 122)) || name.charAt(0) < 65 || name.charAt(0) > 90) {
                System.out.print("Введіть " + s + " студента використовуючи тільки літери англійського алфавіту:перша літера повинна бути великою ");
                name = DataInput.getString();
                i = -1;
            }
        }
        return name;
    }

    private static void sout(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }

    private static void enteringTheFirstLetter(Student[][] students1) throws IOException {
        System.out.print("Введіть першу літеру прізвища студентів яких хочете знайти(якщо введете декілька символів, програма візьме тільки 1 букву): ");
        char firstLetterSurname = (char) (DataInput.getChar() - 65);
        for (int i = 0; i < students1[firstLetterSurname].length; i++) {
            System.out.println(students1[firstLetterSurname][i]);
        }
    }

    private static Student[] addInArray(Student[] students, Student student) {
        Student[] studentsHelper = students;
        students = new Student[students.length + 1];
        students[students.length - 1] = student;
        for (int i = 0; i < studentsHelper.length; i++) {
            students[i] = studentsHelper[i];
        }
        return students;
    }
}
