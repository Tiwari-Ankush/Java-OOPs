
//interfaces
// it acts like a multiple inheritance

// all fields in interfaces are public, static and final by default
// all methods are public and abstract by default

// a class that implements an interface must 
// implement all the methods declared in the interface

interface Animal {
    void walk();

}

class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");

    }
}

class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class interface01 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
    }
}
