// classes and objects practice

class Student {
    String name;
    int age;

    public void getInfo() {
        String a = this.name;
        int b = this.age;
        System.out.println(a);
        System.out.println(b);
    }

}

public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ankush";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Tiwari";
        s2.age = 20;
        s1.getInfo();
        s2.getInfo();
    }
}
