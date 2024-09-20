
import java.util.*;
public class problem3 {
    



    
    public static void dfs(int vertex, Map<Integer, List<Integer>> adjList, Set<Integer> visited) {

        visited.add(vertex);
        System.out.print(vertex + " ");

        
        for (int neighbor : adjList.get(vertex)) {
            
            if (!visited.contains(neighbor)) {
                dfs(neighbor, adjList, visited);
            }
        }
    }

    
    public static void main(String[] args) {
        
        Map<Integer, List<Integer>> adjList = new HashMap<>();

        
        adjList.put(0, Arrays.asList(1, 2));
        adjList.put(1, Arrays.asList(0, 3, 4));
        adjList.put(2, Arrays.asList(0, 5));
        adjList.put(3, Arrays.asList(1));
        adjList.put(4, Arrays.asList(1));
        adjList.put(5, Arrays.asList(2));
        Set<Integer> visited = new HashSet<>();

        System.out.println("DFS traversal starting from vertex 0:");

        
        dfs(0, adjList, visited);
    }
}


