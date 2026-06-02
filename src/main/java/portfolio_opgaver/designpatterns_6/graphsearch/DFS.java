package portfolio_opgaver.designpatterns.graphsearch;

import java.util.ArrayDeque;
import java.util.Deque;

public class DFS implements SearchStrategy {

    @Override
    public Node search(String targetname, Node start) {
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(start);

        while (!stack.isEmpty()) {

            System.out.print("Current stack: ");
            for (Node item : stack) {
                System.out.print(item.getName() + " ");
            }
            System.out.println();

            Node currentNode = stack.pop();

            if (currentNode.getName().equals(targetname)) {
                System.out.println("Finished searching!");
                return currentNode;
            } else {
                for (Node neighbor : currentNode.getNeighbors()) {
                    stack.push(neighbor);
                }
            }
        }
        return null;
    }
}

