package exercise.Fan;

public class Main {
    public static void main(String[] args) {
        ClassFan Fan1 = new ClassFan(3,true,10,"yellow");
        ClassFan Fan2 = new ClassFan(2,false,5,"blue");

        System.out.println(Fan1.toString());
        System.out.println("");
        System.out.println(Fan2.toString());
        //  Bật Fan2 lên để kiểm tra
        Fan2.turnOn(true);
        System.out.println("");
        System.out.println(Fan2.toString());
    }
}
