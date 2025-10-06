package org.mossimo;

/*
Inheritance

'extends' takes whatever is in Student and allows it
to be used in the 'Main' class without having to rewrite everything
 */

public class Main extends Student {
    // method
    public static void main(String[] args) {
        // Student student;
        /*
        creating Student object that holds all
        information from Student file
         */

        Student s1 = new Student("Bob", "male", 20); // default constructor
        /*
        Same structure as:

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
         */

        Student s2 = new Student("Janice", "female", 12);
        s2.sayHi();
        /*
        example for 'extends'
         */

        Student s3 = new Student("John", "male", 38);
        Student s4 = new Student("Sylvia", "female", 22);
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = s5;

        System.out.println(s1);
        /*
        When printing, we get this: org.mossimo.Student@6acbcfc0

        @6acbcfc0
        This is the hexadecimal representation of the object's hash code
        (a number that represents the object's memory address)
         */

        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5 == s7);
        System.out.println(s5.equals(s6));

        }
    }
