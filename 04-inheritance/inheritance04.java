// hYBRID INHERITANCE CONCEPT
// combination of inheritance types, such as multiple inheritance, 
// multilevel inheritance, or hierarchical inheritance

// Grandparent class
class Grandparent {
    void displayGrandparent() {
        System.out.println("Inside Grandparent class");
    }
}

// Parent class inheriting from Grandparent
class Parent extends Grandparent {
    void displayParent() {
        System.out.println("Inside Parent class");
    }
}

// Child class inheriting from Parent and Grandparent
class Child extends Parent {
    void displayChild() {
        System.out.println("Inside Child class");
    }
}

public class inheritance04 {
    public static void main(String[] args) {
        // Creating objects and calling methods
        Child child = new Child();
        child.displayGrandparent(); // inherited from Grandparent
        child.displayParent(); // inherited from Parent
        child.displayChild(); // specific to Child

    }
}
