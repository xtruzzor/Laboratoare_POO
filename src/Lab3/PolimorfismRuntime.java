package Lab3;


public class PolimorfismRuntime {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.sound();
        Animal dog1 = new Dog();
        dog1.sound();

    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

