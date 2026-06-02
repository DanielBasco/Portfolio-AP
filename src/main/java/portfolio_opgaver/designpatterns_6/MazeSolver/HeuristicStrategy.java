package portfolio_opgaver.designpatterns.MazeSolver;

import algorithms.maze.MazeNode;

public interface HeuristicStrategy {
     int calculate(MazeNode node,MazeNode destination);
}
