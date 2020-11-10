package demo;
public class HelloWorld {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.walk();
    }
}

class Animal {
    // Properties
    private String name;
    private int type;
    private int leg; // byte, short, int, long
    // Behavior

    void walk() {
        System.out.println("Walk");
    }

}
