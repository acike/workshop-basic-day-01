public class DemoInherit {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Animal(),
                new Dog(),
                new Cat()
        };
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}

class Animal{
    void speak() {
        System.out.println("Animal");
    }
}
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat");
    }
}


