public class single2 {
    public static void main(String[] args) {
        // Using superclass reference for subclass object
        Animal myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method in the subclass
    }
}
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}