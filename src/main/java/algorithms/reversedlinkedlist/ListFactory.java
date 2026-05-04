package algorithms.reversedlinkedlist;

public class ListFactory {

    // Bygger en liste af et antal int-værdier
    public static Node buildList(int... values) {
        if (values.length == 0) return null;
        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

 // Custom men fejl fordi det ikke er en linkedList
    public static Node customReverse(int... values){
        if (values.length == 0) return null;
        Node head = new Node(values[values.length-1]);
        Node current = head;
        for (int i = values.length-2; i > -1; i--) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    public static Node reverseList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


}
