package portfolio_opgaver.designpatterns.MazeSolver;

import algorithms.maze.MazeNode;

public class Euclidean implements HeuristicStrategy{

    @Override
    public int calculate(MazeNode node, MazeNode destination) {
        int dr = destination.getRow() - node.getRow();
        int dc = destination.getCol() - node.getCol();
        return (int) Math.sqrt(dr * dr + dc * dc);
    }
}
