package org.mossimo;

public class Student {      // blueprint for creating a new data class
    // example for 'extends'
    public void sayHi() {
        System.out.println("Hi");
    }

    // data member (field) [private]
    private String name;
    private String gender;
    private int age;

    // Constructor method (build a new object)
    /*
    Used to build an object
        1. Always (99.9%) public
        2. Always non-static (no static)
        3. Always no return type (no void)
        4. The name MUST be the same as the class name (Student)
        5. Usually overload
     */

    // Default constructor or no argument constructor
    public Student() {
        this.name = "Mike"; // this student's name
        this.gender = "male"; // this student's gender
        this.age = 18; // this student's age
        /*
        The 'this.' keyword is a reference to the current object
        within an instance method or a constructor
         */
    }

    // All arguments constructor
    public Student(String name, String gender, int age) {
        this.name = "Mike";
        this.gender = "male";
        this.age = 18;
    }

    // converts object to string
    // usually used for output
    public String toString() {
        return String.format("Name: %s, Gender: %s, Age: %d", name, gender, age);
    }

    public boolean equals(Student student) {
        return this.name.equals(student.name) &&
            this.gender.equals(student.gender) &&
            this.age  == student.age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int age() {
        return age;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
