package algorithms.maze;

public class MazeExercise {
    static final int N = 4;

    static int[][] maze = {
            {1, 0, 1, 1},
            {1, 1, 1, 0},
            {0, 0, 1, 1},
            {1, 1, 0, 3}
    };

    static int[][] path = new int[N][N];

    public static void main(String[] args) {
        if (solveMaze(0, 0)) {
            printPath();
        } else {
            System.out.println("Ingen løsning fundet.");
        }
    }

    /*
Markere feltet som en del af stien (path)
Prøv de fire retninger én af gangen
ned
højre
op
venstre
Hvis ingen muligheder virker, så backtrack (og fjern feltet fra path)
Du kan søge inspiration i backtracking/NQueeens
     */
    // TODO: Implementer denne metode
    static boolean solveMaze(int row, int col) {



            // 1. Tjekker labyrintens grænser
            if(row >= N || col >= N || row < 0 || col < 0) return false;

            // 2. Tjekker om det er et gyldigt felt og ikke allerede besøgt
            if(maze[row][col] == 0 || path[row][col] == 1) return false;

            // 3. Markere felt som del af stien
            path[row][col] = 1;

            // 4. Tjekker om vi er i mål
            if(maze[row][col] == 3) return true;

            // 5. Prøver ned, højre, op og venstre
            // ned
            if(solveMaze(row+1, col)) return true;

            // højre
            if(solveMaze(row, col+1)) return true;

            //op
            if(solveMaze(row-1, col)) return true;

            //venstre
            if (solveMaze(row, col-1)) return true;

            //6. Hvis ingen virkede path = 0. Backtrack
            path[row][col] = 0;
            return false;


    }

    static void printPath() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    }
}
