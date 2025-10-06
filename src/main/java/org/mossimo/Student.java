package org.mossimo;

public class Student {      // blueprint for creating a new data class

    // data member (field)
    private String name;
    private String gender;
    private int age;

    // Constructor method (build a new object)
    /*
    Used to build an object
        1. Always public
        2. Always non-static (no static)
        3. Always no return type (no void)
        4. The name MUST be the same as the class name (Student)
     */

    // Default constructor
    public Student() {
        this.name = "Mike"; // this student's name
        this.gender = "male"; // this student's gender
        this.age = 18; // this student's age
        /*
        The 'this.' keyword is a reference to the current object
        within an instance method or a constructor
         */


    }


}
