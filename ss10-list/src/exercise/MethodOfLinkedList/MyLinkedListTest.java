package exercise.MethodOfLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        myList.add(0, 10);
        myList.add(1, 20);
        myList.add(2, 30);

        System.out.println(myList.size());
        myList.remove(1);
        System.out.println(myList.size());
        MyLinkedList<Integer> myListClone = myList;
        System.out.println(myListClone.size());
        System.out.println(myListClone.get(1));
        myListClone.clear();
        System.out.println(myListClone.size());
    }
}

