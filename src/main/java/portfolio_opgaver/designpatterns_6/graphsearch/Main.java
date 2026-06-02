package portfolio_opgaver.designpatterns.graphsearch;

public class Main {

    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");

        A.addNeighbor(B);
        A.addNeighbor(C);
        A.addNeighbor(D);
        C.addNeighbor(E);

        SearchStrategy strategy = new BFS();

        System.out.println("BFS starting...");
        Node result = strategy.search("E", A);
        System.out.println(result != null ? "Found: " + result.getName() : "Found nothing!");

        strategy = new DFS();

        System.out.println("\nDFS starting...");
        result = strategy.search("E", A);
        System.out.println(result != null ? "Found: " + result.getName() : "Found nothing!");
        }
    }
