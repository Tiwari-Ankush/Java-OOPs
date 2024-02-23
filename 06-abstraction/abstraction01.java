
// Abstraction

// etry to obtain an abstract view, model or structure of a real life problem, and
//  reduce its unnecessary details. With definition of properties of problems,
//  including the data which are affected and the operations which are identified,
//  the model abstracted from problems can be a standard solution to this type of
//  problems. It is an efficient way since there are nebulous real-life problems that
//  have similar properties.

// In simple terms, it is hiding the unnecessary details & showing only the
// essential parts/functionalities to the user.

// Data binding: it is a process of binding the application UI and business logic. Any change made in the business logic will reflect directly to the application UI

// Abstraction is achieved in 2 ways
// Abstract class
// interfaces(Pure abstraction)

abstract class Animal {
    abstract void walk();

    void breathe() {
        System.out.println("This animal breathes air");
    }

    Animal() {
        System.out.println("You are about to create an Animal.");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("How you have created a Horse!");
    }

    void walk() {
        System.out.println("Horse walks on 4 legs.");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Wow you have created a chicken.");
    }

    void walk() {
        System.out.println("Chicken walks on 2 legs.");
    }
}

public class abstraction01 {

    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk();

        h.breathe();

    }
}
