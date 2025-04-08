import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacentList {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of vertices");
    int numberOfVertices = in.nextInt();
    System.out.println("Enter the number of edges");
    int numberOfEdges = in.nextInt();

    List<List<Integer>> adj = new ArrayList<>();
    for(int i = 0;i < numberOfVertices + 1;i++){
      adj.add(new ArrayList<>());
    }

    for(int i = 0;i < numberOfEdges;i++){
      int src = in.nextInt();
      int des = in.nextInt();

      adj.get(src).add(des);
    }

    for(int i = 1;i < adj.size();i++){
      System.out.println(adj.get(i));
    }
  }
}
