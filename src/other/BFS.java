package other;

import java.util.*;

public class BFS {

    public static void bfs(int n, int[][] graph, int start) {
        boolean[] visited = new boolean[n];
        visited[start] = true;
        bfsRecursive(n, graph, start, visited);

    }
    public static void bfsRecursive(int n, int[][] graph, int start, boolean[] visited) {
        for (int i = 0; i < n; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                visited[i] = true;
                System.out.print(i + " ");
                bfsRecursive(n, graph, i, visited);
            }
        }
    }
    public static void bfsMatrix(int n, int[][] graph, int start) {

        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[n];
        queue.add(start);

        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int i = 0; i < n; i++) {
                if (graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void bfsList(int n, List<Integer>[] adj, int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int i = 0; i < adj[current].size(); i++) {
                int next = adj[current].get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = 7;
        int[][] adjMatrix = {
                {0,1,1,0,0,0,0},
                {1,0,0,1,1,0,0},
                {1,0,0,0,0,1,1},
                {0,1,0,0,0,0,0},
                {0,1,0,0,0,0,0},
                {0,0,1,0,0,0,0},
                {0,0,1,0,0,0,0},
        };

        List<Integer>[] adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        adjList[0].add(1);
        adjList[0].add(2);
        adjList[1].add(3);
        adjList[1].add(4);
        adjList[2].add(5);
        adjList[2].add(6);

        bfs(n, adjMatrix, 0);
        System.out.println();
        bfsList(n, adjList, 0);
        System.out.println();
        bfsMatrix(n, adjMatrix, 0);

    }
}
