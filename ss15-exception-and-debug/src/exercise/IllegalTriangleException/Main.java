package exercise.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionTriangle check = new ExceptionTriangle("");
        int a;
        int b;
        int c;
        do {
            System.out.print("Nhap vao canh thu nhat: ");
            a = sc.nextInt();
            System.out.print("Nhap vao canh thu hai: ");
            b = sc.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            c = sc.nextInt();

            try {
                check.checkInputEdge(a, b, c);
                System.out.println("Bạn vừa nhập tam giác có 3 cạnh là: " + a + "," + b + "," + c);
            } catch (Exception error) {
                System.out.println(error.getMessage());
            }
        } while (a < 0 || b < 0 || c < 0 || a + b <= c || a + c <= b || b + c <= a);
    }
}
