package TCScodeVita;
import java.util.*;

public class Problem1 {

    static class Position {
        int x, y, moves;

        Position(int x, int y, int moves) {
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }

    public static int minMovesToDestination(int M, int N, int[][] grid, int[] source, int[] destination, int[] moveRule) {
        // Directions based on move rule
        int dx = moveRule[0];
        int dy = moveRule[1];
        int[][] directions = {
                {dx, dy},       // Forward
                {dy, -dx},     // Right (90 degrees clockwise)
                {-dx, -dy},    // Backward (180 degrees)
                {-dy, dx}      // Left (90 degrees counterclockwise)
        };

        int startX = source[0], startY = source[1];
        int destX = destination[0], destY = destination[1];

        // BFS initialization
        Queue<Position> queue = new LinkedList<>();
        boolean[][] visited = new boolean[M][N];
        queue.offer(new Position(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Position current = queue.poll();

            // Check if we reached the destination
            if (current.x == destX && current.y == destY) {
                return current.moves;
            }

            // Explore all 4 possible directions
            for (int[] dir : directions) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];

                // Check if the new position is within bounds and not visited
                if (newX >= 0 && newX < M && newY >= 0 && newY < N && grid[newX][newY] == 0 && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.offer(new Position(newX, newY, current.moves + 1));
                }
            }
        }

        return -1;  // Destination unreachable
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] grid = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int[] source = {scanner.nextInt(), scanner.nextInt()};
        int[] destination = {scanner.nextInt(), scanner.nextInt()};
        int[] moveRule = {scanner.nextInt(), scanner.nextInt()};

        // Get the result
        int result = minMovesToDestination(M, N, grid, source, destination, moveRule);
        System.out.println(result);

        scanner.close();
    }
}

