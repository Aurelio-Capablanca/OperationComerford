package org.example;

class Dog {
    private String name;

    public Dog(String dog) {
        this.name = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class otherTEST {
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;
        System.out.println("aDog variable: "+aDog.getName());
        System.out.println("oldDog variable: "+oldDog.getName());
        foo(aDog);
        // when foo(...) returns, the name of the dog has been changed to "Fifi"
        System.out.println(aDog.getName().equals("Fifi")); // true
        // but it is still the same dog:
        System.out.println("aDog variable: "+aDog.getName());
        System.out.println("oldDog variable: "+oldDog.getName());
        System.out.println(aDog == oldDog); // true
    }


    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        // this changes the name of d to be "Fifi"
        d.setName("Fifi");
    }

}
