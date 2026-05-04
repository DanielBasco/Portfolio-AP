package algorithms.reversedlinkedlist;


public class Main {

    public static void main(String[] args) {

      Node head = ListFactory.buildList(1, 2, 3, 4, 5);
      Node customHead = ListFactory.customReverse(1,5,7,12,17);
        System.out.println("LinkedList: " + head.toString());
        head = ListFactory.reverseList(head);
        System.out.println("LinkedList reversed: " + head.toString());

        System.out.println("Custom reverse "+customHead);
    }


}
