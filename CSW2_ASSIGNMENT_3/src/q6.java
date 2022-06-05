import java.util.*;

public class q6 {
    static void AddEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void DFS(ArrayList<ArrayList<Integer>> graph, int src) {
        boolean[] visited = new boolean[graph.size()];
        Stack<Integer> stk = new Stack<>();

        stk.push(src);
        visited[src] = true;

        while (!stk.isEmpty()) {
            int curr = stk.pop();
            System.out.println(curr + " visited!");
            for (int i : graph.get(curr)) {
                if (!visited[i]) {
                    visited[i] = true;
                    stk.add(i);
                }
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        int vertex = 4;

        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<Integer>());
        }
        AddEdge(graph, 0, 1);
        AddEdge(graph, 1, 2);
        AddEdge(graph, 2, 3);
        AddEdge(graph, 3, 1);

        DFS(graph, 0);

    }
}
