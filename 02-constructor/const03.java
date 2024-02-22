// copy constructor

class Copy {
    String name;
    int age;

    Copy() {

    }

    Copy(Copy original) {
        this.name = original.name;
        this.age = original.age;

    }
}

public class const03 {
    public static void main(String[] args) {
        Copy c1 = new Copy();
        c1.name = "Ankush";
        c1.age = 21;

        Copy c2 = new Copy(c1);

        System.out.println(c2.name);
        System.out.println(c2.age);
    }
}
