package algorithms.reversedlinkedlist;

import java.util.Objects;

class Node {

    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    @Override
    public String
    toString() {
     return value+"->"+next;
    }
}
