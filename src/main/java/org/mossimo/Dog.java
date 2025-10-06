package org.mossimo;

// PUTTING EVERYTHING WE LEARNED INTO ONE FILE

public class Dog {
    // fields name, age, gender, breed
    private String name;
    private int age;
    private String gender;
    private String breed;

    // constructor (always first method)
    public Dog() {
        // default values
        this.name = "unknown";
        this.age = -1;
        this.gender = "unknown";
        this.breed = "unknown";
    }

    // all args constructor
    public Dog(String name , int age, String gender, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Gender: %s, Breed: %s", name, age, gender, breed);
    }

    public boolean equals(Dog dog) {
        return this.name.equals(dog.name) &&
                this.age == dog.age &&
                this.gender.equals(dog.gender) &&
                this.breed.equals(dog.breed);
    }

    // GETTER
    public String getName() {
        return name;
    }

    // SETTER
    public void setName(String name) {
        this.name = name;
    }
}
