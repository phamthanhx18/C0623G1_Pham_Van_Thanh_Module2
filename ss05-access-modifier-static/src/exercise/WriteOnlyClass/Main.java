package exercise.WriteOnlyClass;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        // Display xem gia tri truoc khi set
        System.out.println(student.displayStudent());

        student.setName("Thanh");
        student.setClasses("C0623G1");
        System.out.println(student.displayStudent());
    }
}
