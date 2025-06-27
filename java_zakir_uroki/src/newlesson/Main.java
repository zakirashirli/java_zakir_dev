package newlesson;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.voice();
        myDog.bark();

    }
}



// superclass
class Animal {
    void voice() {
        System.out.println("Animal Sound");
    }
}

// subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Собака Лает");
    }
}
