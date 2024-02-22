// parameterized constructor exmaple

class Param {
    String name;
    int age;

    Param(String name, int age) {
        // System.out.println("Name is:" + name + " " + "Age is: " + age);

        this.name = name;
        this.age = age;
    }
}

public class const02 {
    public static void main(String[] args) {
        // Param p1 = new Param("Ankush", 21);
        Param p2 = new Param("ankush", 23);
        // p2.name = "Tiwari";

    }
}
