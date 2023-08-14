package exercise.MethodOfArrayList;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(myList);

        myList.add(1,5);
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

        MyList clone = myList.clone();
        System.out.println(clone);

        System.out.println(myList.size());

        System.out.println(myList.contains(clone));

        System.out.println(myList.indexOf(2));
        System.out.println(myList.get(1));
    }
}
