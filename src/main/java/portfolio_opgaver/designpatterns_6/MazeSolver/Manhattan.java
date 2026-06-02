package portfolio_opgaver.designpatterns.MazeSolver;

import algorithms.maze.MazeNode;

public class Manhattan implements HeuristicStrategy{

    @Override
    public int calculate(MazeNode node, MazeNode destination) {
        return Math.abs(destination.getRow() - node.getRow())
                + Math.abs(destination.getCol() - node.getCol());
    }
}
