package exercise.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionTriangle exTriangle = new ExceptionTriangle("");
        int a = 0;
        int b = 0;
        int c = 0;
        do {
            try {
                do {
                    try {
                        System.out.print("Nhập giá trị của cạnh thứ nhất: ");
                        a = Integer.parseInt(sc.nextLine());
                        if (a <= 0) {
                            System.out.println("Vui lòng nhập số lớn hơn 0");
                        }
                    } catch (NumberFormatException exception) {
                        System.out.println("Bạn cần nhập số !");
                    }
                } while (a <= 0);

                do {
                    try {
                        System.out.print("Nhập giá trị của cạnh thứ hai: ");
                        b = Integer.parseInt(sc.nextLine());
                        if (b <= 0) {
                            System.out.println("Vui lòng nhập số lớn hơn 0");
                        }
                    } catch (NumberFormatException exception) {
                        System.out.println("Bạn cần nhập số !");
                    }
                } while (b <= 0);

                do {
                    try {
                        System.out.print("Nhập giá trị của cạnh thứ ba: ");
                        c = Integer.parseInt(sc.nextLine());
                        if (c <= 0) {
                            System.out.println("Vui lòng nhập số lớn hơn 0");
                        }
                    } catch (NumberFormatException exception) {
                        System.out.println("Bạn cần nhập số !");
                    }
                } while (c <= 0);
                exTriangle.checkInputEdge(a, b, c);
            } catch (ExceptionTriangle e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (a + b <= c || a + c <= b || b + c <= a);
    }
}
