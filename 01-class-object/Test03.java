class Area {
    int length;
    int breadth;
    int radius;
    static final float constant = 3.14F;

    public void rectangle() {
        System.out.println("Area of rectangle is " + (this.length * this.breadth));
    }

    public void circle() {
        System.out.println("The area of circle is " + (constant * radius * radius));
    }
}

public class Test03 {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.length = 12;
        a1.breadth = 10;
        a1.radius = 4;
        a1.rectangle();
        a1.circle();
    }
}
