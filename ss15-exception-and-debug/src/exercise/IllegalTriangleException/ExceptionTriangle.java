package exercise.IllegalTriangleException;

import java.util.InputMismatchException;

public class ExceptionTriangle extends Exception {

    public ExceptionTriangle(String message) {
        super(message);
    }

    public void checkInputEdge(int a, int b, int c) throws Exception {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new ExceptionTriangle("Error: 2 cạnh không lớn hơn cạnh còn lại !, vui lòng thử lại");
        } else {
            System.out.println("Tạo 3 cạnh của giác hợp lệ");
        }
    }
}
