package polyphormism;

public class MainPoly {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Animal also_dog = new Dog();

        Cat cat = new Cat();
        Animal cat2 = new Cat();

        dog.sound();
        cat.sound();
        also_dog.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("....");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("dog's sound");
    }

    void dog_info() {
        System.out.println("она белая и это хаски");
    }
}

class Cat extends Animal {
    @Override
    void sound (){
        System.out.println("cat's sound");
    }
}