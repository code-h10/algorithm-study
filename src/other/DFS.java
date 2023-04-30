package other;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {

    public static void dfsList(int n, List<Integer>[] adj, int start) {
        Stack<Integer> stack = new Stack<>();
        stack.add(start);

        boolean[] visited = new boolean[n];

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (!visited[current]) {
                visited[current] = true;

                System.out.print(current + " ");

                for (int next : adj[current]) {
                    if (!visited[next]) {
                        stack.push(next);
                    }
                }
            }
        }
    }

    public static void dfsMatrix(int n, int[][] adj, int start) {
        Stack<Integer> stack = new Stack<>();
        stack.add(start);

        boolean[] visited = new boolean[n];

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");

                for (int i = n - 1; i >= 0 ; i--) {
                    if (adj[current][i] == 1 && !visited[i]) {
//                        System.out.println(current + " " + i);
                        stack.push(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = 5;
        int[][] adjMatrix = {
                {0,1,1,0,0},
                {1,0,0,1,0},
                {1,0,0,1,1},
                {0,1,1,0,1},
                {0,0,1,1,0}
        };

        List<Integer>[] adjList = new ArrayList[5];

        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }

        adjList[0].add(1);
        adjList[0].add(2);
        adjList[1].add(3);
        adjList[2].add(3);
        adjList[2].add(4);
        adjList[3].add(4);

        dfsList(n, adjList, 0);
        System.out.println();
        dfsMatrix(n, adjMatrix, 0);
    }

}
