package exercise.Colorable;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = {new Circle(3,"red",true),
                            new Rectangle(5, 10),
                            new Rectangle(),
                            new Circle(10),
                            new Rectangle(20, 15,"blue",true)};

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
