package com.company;

public class Main {

    public static void main(String[] args) {
        // Make two students
        Student a = new Student(12); // new 12 unit student
        Student b = new Student(); // New 15 unit student (default constructor)

        // They respond to getUnits() and getStress()
        System.out.println("Student A units:" + a.getUnits() + " stress:" + a.getStress());
        System.out.println("Student B units:" + b.getUnits() + " stress:" + b.getStress());

        System.out.println("Student A drops 3 units");
        a.dropUnits(3); // a drops a class
        System.out.println("Student A units:" + a.getUnits() + " stress:" + a.getStress());

        // Now "b" points to the same object as "a" (pointer copy)
        b = a;
        b.setUnits(10);
        System.out.println("Student B = Student A, b.setUnits(10)");

        // So the "a" units have been changed
        System.out.println("Student A units:" + a.getUnits() + " stress:" + a.getStress());

        // NOTE: public vs. private //
        /* A statement like "b.units = 10;" will not compile in a client
           of the Student class when units is declared protected or private */

    }
}
