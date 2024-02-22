
class Color {
    String color;

    public void getColor() {
        System.out.println("The color of Given pen is " + this.color);
    }
}

public class Test02 {
    public static void main(String[] args) {
        Color c1 = new Color();
        c1.color = "Pink";
        c1.getColor();

        Color c2 = new Color();
        c2.color = "Blue";
        c2.getColor();

    }
}
