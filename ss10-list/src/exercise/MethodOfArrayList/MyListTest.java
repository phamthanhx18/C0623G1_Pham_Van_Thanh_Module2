package exercise.MethodOfArrayList;

public class MyListTest {
    public static void main(String args[]) {
        MyList<Integer> myList = new MyList<>(10);

        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4, 5);

        System.out.println("Size: " + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.remove(2);

        System.out.println("Size: " + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        MyList<Integer> clonedList = myList.clone();
        System.out.println("Size: " + clonedList.size());
        for (int i = 0; i < clonedList.size(); i++) {
            System.out.print(clonedList.get(i) + " ");
        }
        System.out.println();

        System.out.println("Contains 3: " + myList.contains(2));

        System.out.println("Index of 5: " + myList.indexOf(5));
    }
}

