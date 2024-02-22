//Single level inheritance 

//   Parent
//     ||
//     ||
//    child

class Parent {
    public void display() {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent {
    public void printInfo() {
        System.out.println("This is Child class.");
    }
}

public class inheritance01 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.printInfo(); // calling child function
        c1.display(); // calling parent class function (inheritance property)
    }
}
