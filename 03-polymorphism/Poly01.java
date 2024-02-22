// Compile time PolyMorphism
// METHOD OVERRLOADING 

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Poly01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("Ankush");
        s1.printInfo(21);
        s1.printInfo("TIwari", 21);
    }
}
