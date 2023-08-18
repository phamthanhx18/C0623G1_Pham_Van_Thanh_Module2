package exercise.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExceptionTriangle check = new ExceptionTriangle("");

        System.out.print("Nhap vao canh thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao canh thu hai: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao canh thu ba: ");
        int c = sc.nextInt();

        try {
            check.checkInputEdge(a, b, c);
            System.out.println("Bạn vừa nhập tam giác có 3 cạnh là: "+a+","+b+","+c);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

    }

}
