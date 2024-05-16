package week4_programme.programme23;

/**
 * Creating a child class
 */
public class Bike extends Vehicle {
    public static void main(String args[]) {
        Bike obj = new Bike();//creating object
        obj.run();//calling method
    }

    public void run() {                             //defining the same method as in the parent class
        System.out.println("Bike is running safely");
    }
}

