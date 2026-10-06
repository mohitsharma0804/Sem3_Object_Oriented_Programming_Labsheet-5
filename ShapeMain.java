// Q18: Shape Hierarchy — Parent Reference Array
class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void displayShapeName() {
        System.out.print("Shape: " + name + " -> ");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class ShapeManager {
    public void displayAreas(Shape[] shapes) {
        System.out.println("=== Calculating Shape Areas ===");
        // Local loop variable i
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayShapeName();
            if (shapes[i] instanceof Circle) {
                Circle c = (Circle) shapes[i];
                System.out.printf("Circle Area: %.2f\n", c.calculateArea());
            } else if (shapes[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) shapes[i];
                System.out.println("Rectangle Area: " + r.calculateArea());
            }
        }
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Red Circle", 5.0),
            new Rectangle("Blue Rectangle", 4.0, 6.0)
        };

        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}
