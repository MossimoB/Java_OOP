package org.mossimo;


public class Main {
    // method
    public static void main(String[] args) {
        // Student student;
        /*
        creating Student object that holds all
        information from Student file
         */

        Student s1 = new Student(); // default constructor
        /*
        Same structure as:

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
         */

        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        System.out.println(s1);
        /*
        When printing, we get this: org.mossimo.Student@6acbcfc0

        @6acbcfc0
        This is the hexadecimal representation of the object's hash code
        (a number that represents the object's memory address)
         */


        }
    }
