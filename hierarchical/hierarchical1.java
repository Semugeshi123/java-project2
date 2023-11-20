public class hierarchical1{
    public static void main(String[] args) {
        // Accessing superclass members in hierarchical inheritance
        Circle myCircle = new Circle();
        myCircle.draw();

        Rectangle myRectangle = new Rectangle();
        myRectangle.draw();

        Triangle myTriangle = new Triangle();
        myTriangle.draw();
    }
}
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Subclass 3
class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }
}