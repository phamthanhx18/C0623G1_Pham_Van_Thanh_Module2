package exercise.IllegalTriangleException;

public class ExceptionTriangle extends Exception {

    public ExceptionTriangle(String message) {
        super(message);
    }

    public void checkInputEdge(int a, int b, int c) throws Exception {
        if (a < 0 || b < 0 || c < 0) {
            throw new ExceptionTriangle("Error: Cạnh phải là số dương !");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new ExceptionTriangle("Error: 2 cạnh không lớn hơn cạnh còn lại !");
        } else {
            System.out.println("Tạo 3 cạnh của giác hợp lệ");
        }
    }
}
