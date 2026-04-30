package feb.ex_15022026;
//Data types
//public class // Parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// First child class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Second child class
class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();    // from Animal class
        d.bark();   // from Dog class

        System.out.println();

        Cat c = new Cat();
        c.eat();    // from Animal class
        c.meow();   // from Cat class
    }
}

