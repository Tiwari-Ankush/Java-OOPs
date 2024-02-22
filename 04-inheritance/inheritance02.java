// Hierarchical inheritance
//multiple subclasses inherit from the single parent or base class.

class Parent {
    public void display() {
        System.out.println("This is parent class.");
    }
}

class Child1 extends Parent {
    public void print() {
        System.out.println("This is First Child class.");
    }
}

class Child2 extends Parent {
    public void show() {
        System.out.println("This is second Child class.");
    }
}

public class inheritance02 {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        Child1 c1 = new Child1();

        c2.show();
        c2.display();
        System.out.println(); // for single line space
        c1.print();
        c1.display();
    }
}
