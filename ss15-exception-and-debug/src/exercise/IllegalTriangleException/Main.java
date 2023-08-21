package exercise.IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionTriangle check = new ExceptionTriangle("");
            try {
                int a;
                int b;
                int c;
                System.out.print("Nhap vao canh thu nhat: ");
                a = sc.nextInt();
                System.out.print("Nhap vao canh thu hai: ");
                b = sc.nextInt();
                System.out.print("Nhap vao canh thu ba: ");
                c = sc.nextInt();
                check.checkInputEdge(a, b, c);
                System.out.println("Bạn vừa nhập tam giác có 3 cạnh là: " + a + "," + b + "," + c);
            } catch (ExceptionTriangle ex) {
                System.out.println(ex.getMessage());
            } catch (InputMismatchException error) {
                System.out.println("Vui lòng nhập số !");
            } catch (Exception error) {
                System.out.println(error.getMessage());
            }
    }
}
