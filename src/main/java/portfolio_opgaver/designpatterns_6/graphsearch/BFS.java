package portfolio_opgaver.designpatterns.graphsearch;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS implements SearchStrategy{
    @Override
    public Node search(String targetname, Node start) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            System.out.print("Current queue: ");
            for (Node item : queue) {
                System.out.print(item.getName() + " ");
            }
            System.out.println();

            Node currentNode = queue.remove();

            if (currentNode.getName().equals(targetname)) {
                System.out.println("Finished searching!");
                return currentNode;
            }
            else queue.addAll(currentNode.getNeighbors());
        }
        return null;
    }
}
