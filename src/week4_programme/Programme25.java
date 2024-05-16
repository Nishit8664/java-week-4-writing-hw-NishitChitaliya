package week4_programme;

//Java program to overload constructors
public class Programme25 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Programme25(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Programme25(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public static void main(String args[]) {
        Programme25 s1 = new Programme25(111, "Karan");
        Programme25 s2 = new Programme25(222, "Aryan", 25);
        s1.display();
        s2.display();
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
