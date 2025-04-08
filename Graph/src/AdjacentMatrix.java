import java.util.Scanner;

public class AdjacentMatrix {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of vertices");
    int numberOfVertices = in.nextInt();
    System.out.println("Enter the number of edges");
    int numberOfEdges = in.nextInt();

    int[][] adj = new int[numberOfVertices + 1][numberOfVertices + 1];
    final int inf = 100000;

    for (int i = 1; i < adj.length; i++) {
      for (int j = 1; j < adj.length; j++) {
        if (i == j) {
          adj[i][j] = 0;
        } else {
          adj[i][j] = inf;
        }
      }
    }

    for (int i = 0; i < numberOfEdges; i++) {
      int src = in.nextInt();
      int des = in.nextInt();
      int cost = in.nextInt(); // only if the graph is weighted

      adj[src][des] = cost;
      adj[des][src] = cost; // only if the graph is undirected
    }

    for (int i = 1; i < adj.length; i++) {
      for (int j = 1; j < adj[i].length; j++) {
        System.out.print(adj[i][j] + " ");
      }
      System.out.println();
    }
  }
}
