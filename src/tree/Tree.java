package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Tree {
    private int size;
    private Map<Integer, LinkedList<Integer>> adj;

    public Tree(int size) {
        this.size = size;
        adj = new HashMap<>();
        for (int i = 0; i < size; i++) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            adj.put(i, linkedList);
        }
    }

    public final void addEdge(int v, int w) {
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    public final void longestPathLength() {
        KeyValue t1;
        KeyValue t2;
        t1 = longestPath(0);
        t2 = longestPath(t1.getKey());
        System.out.print(t2.getValue());
    }

    public KeyValue longestPath(int node) {
        int[] dis = new int[size];
        for (int x = 0; x < size; x++) {
            dis[x] = -1;
        }
        LinkedList<Integer> queue = new LinkedList();
        queue.addLast(node);

        dis[node] = 0;

        while (!queue.isEmpty()) {
            int t = queue.poll();
            LinkedList<Integer> linkedList = adj.get(t);
            for (int v : linkedList) {
                if (dis[v] == -1) {
                    queue.addFirst(v);
                    dis[v] = dis[t] + 1;
                }
            }
        }
        int maxDestination = 0;
        int id = 0;
        for (int i = 0; i < size; i++) {
            if (dis[i] > maxDestination) {
                maxDestination = dis[i];
                id = i;
            }
        }
        return new KeyValue(id, maxDestination);
    }
}
