public class single1 {
    public static void main(String[] args) {
        // Polymorphism in single inheritance
        Shape myShape = new Circle();
        myShape.draw(); // Calls the overridden method in the subclass
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}