
// Multilevel Inheritance 
// a subclass inhetits from another subclass, means Chain like structure

class GrandParent {
    public void display() {
        System.out.println("This is Grandparent class.");
    }
}

class Parent extends GrandParent {
    public void show() {
        System.out.println("This is a Parent class.");
    }
}

class Child extends Parent {
    public void print() {
        System.out.println("This is Child class.");
    }
}

public class inheritance03 {
    public static void main(String[] args) {
        Child c = new Child();
        c.print(); // child class
        c.show(); // parent class
        c.display(); // grandparent class

        Parent p = new Parent();
        p.show();
        p.display();
        // p.print(); // not accessible becoz it runs levelwise
    }
}
