package exercise.ResizeableClassShape;

public class Main {
    public static void main(String[] args) {

        Resizeable[] shapes = {new Circle(5), new Rectangle(3, 4), new Square(2)};

        for (Resizeable shape : shapes) {
            double oldArea = shape.getArea();
            double resizePercentage = Math.random()*100+1;
            shape.resize(resizePercentage);
            double newArea = shape.getArea();
            System.out.println("Dien tich " + shape + " truoc va sau khi resize la " + resizePercentage + "%: " + oldArea + " va " + newArea);
        }
    }
}