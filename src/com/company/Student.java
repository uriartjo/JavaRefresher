package com.company;

 /*     Demonstrates the most basic features of a class.
        A student is defined by their current number of units. There are standard get/set accessors for units.
        The student responds to getStress() to report their current stress level which is a function of their units.
  */

public class Student {
    private int units;   // NOTE this is an "instance variable" named "units"
                        // Every Student object will have its own units variable.
                        // "protected" and "private" mean that clients do not get access protected int units;



    public static final int MAX_UNITS = 20;  //"public static final" declares a public readable constant that is associated with the class -- it's full name is Student.MAX_UNITS.
    public static final int DEFAULT_UNITS = 15; // It's a convention to put constants like that in upper case.

    public Student(int initUnits) {  // Constructs a student with the given units.
        units = initUnits; // Units would be the instance variable
    }

    public Student() {
        this(DEFAULT_UNITS); // "this"  is a special syntax to call one constructor from another -- it must be the first line.
    }

    public int getUnits() { // Gets the current units value (standard "getter" accessor).
        return units;
    }

    public void setUnits(int units) {  // Sets the units (setter)
        if ((units < 0) || (units > MAX_UNITS)) { // Does the new value exceed the MAX_UNITS threshold we previously configured?
            return; // Should the provided value exceed the threshold, you could add an error message here, throw an exception, etc
        }
        this.units = units; // "this.units"  needed here since parameter value and instance variable share the same name. Note the color pattern
    }

    public int getStress() {
        return(units * 10);
    }

    public boolean dropUnits(int drop) {
        if (units-drop >= 9) { // Will refuse to drop units if it falls below 9
            setUnits(units - drop);
            return true;
        }
        return false; }

}
