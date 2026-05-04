package algorithms.circularlinkedlist;



import java.util.List;

public class Main {

    public static void main(String[] args) {
        Node list = ListFactory.buildList(1, 2, 3, 4, 5);
      //  if(!hasCircle(list))
        System.out.println(list);

        Node circularList = ListFactory.buildListWithCycle();
      //   if(!hasCircle(circularList))
       // System.out.println(circularList);
        System.out.println("Custom hasCycle test: "+hasCycle(list));
        System.out.println("Custom hasCycle test: "+hasCycle(circularList));
    }

    /*
    Lav en metode public boolean hasCycle (Node head) (fx i klassen circularlinkedlist.Main) som tager en Node som parameter og returnerer en boolean, der angiver om listen er cycklisk.
Du skal bruge to pointere slow og fast
slow skal bevæge sig gennem listen ét skridt ad gangen
fast skal bevæge sig gennem listen to skridt ad gangen
Hver gang de to pointere har flyttet sig skal du undersøge om de har ramt hinanden
Hvis rammer hinanden returneres true.
Hvis fast når enden af listen returneres false
Test din kode ved at køre main i klassen circularlinkedlist.Main
     */
    public static boolean hasCycle(Node head){
        Node slow = head; // 1 Skridt
        Node fast = head; // 2 Skridt
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
