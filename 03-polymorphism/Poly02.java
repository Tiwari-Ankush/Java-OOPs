// RUNTIME POLYMORPHISM
// USE OF EXTENDS KEYWORD

class Shape {
    public void area() {
        System.out.println("Displays area of different Shapes");

    }

    Shape() { // default constructor which will be called automatically
    };

}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(0.5 * b * h);
    }
}

class Circle extends Shape {
    static final float PI = 3.14F;

    public void area(int r) {
        System.out.println(PI * r * r);
    }
}

public class Poly02 {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();

        Shape s2 = new Circle();
        System.out.println("Area of circle is: ");
        ((Circle) s2).area(3);

        Shape s3 = new Triangle();
        System.out.println("Area of rectangle is: ");
        ((Triangle) s3).area(12, 11);
    }
}
