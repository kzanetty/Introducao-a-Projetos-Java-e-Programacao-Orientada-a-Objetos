package application;

import model.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students in class A: ");
        int x = sc.nextInt();
        Set<Student> a = new HashSet<>();
        for(int i=0; i<x; i++){
            System.out.print("Number of student " + (i+1) + ": ");
            a.add(new Student(sc.nextInt()));
        }

        System.out.print("Number of students in class B: ");
        x = sc.nextInt();
        Set<Student> b = new HashSet<>();
        for(int i=0; i<x; i++){
            System.out.print("Number of student " + (i+1) + ": ");
            b.add(new Student(sc.nextInt()));
        }

        System.out.print("Number of students in class C: ");
        x = sc.nextInt();
        Set<Student> c = new HashSet<>();
        for(int i=0; i<x; i++){
            System.out.print("Number of student " + (i+1) + ": ");
            c.add(new Student(sc.nextInt()));
        }

        Set<Student> allStudents = new TreeSet<>();
        allStudents.addAll(a);
        allStudents.addAll(b);
        allStudents.addAll(c);

        System.out.println("Number of students: " + allStudents.size());
        for(Student student: allStudents){
            System.out.print(" " + student);
        }

        sc.close();
    }
}
