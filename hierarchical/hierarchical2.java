public class hierarchical2{
    public static void main(String[] args) {
        // Polymorphism in hierarchical inheritance
        Animal myDog = new Dog();
        myDog.makeSound();  // Calls the overridden method in the subclass

        Animal myCat = new Cat();
        myCat.makeSound();  // Calls the overridden method in the subclass
    }
}
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}