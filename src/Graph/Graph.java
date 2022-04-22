package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {
    Map<Integer, LinkedList<Integer>> obj;
    Graph(){
        obj = new HashMap<>();
    }
    public void addEdge(int v1, int v2, boolean isBiDirectional){
        LinkedList<Integer> v1neighbour = obj.getOrDefault(v1, new LinkedList<>());
        v1neighbour.add(v2);
        obj.put(v1,v1neighbour);
        if(!isBiDirectional){
            LinkedList<Integer> v2neighbour = obj.getOrDefault(v2, new LinkedList<>());
            v2neighbour.add(v2);
            obj.put(v2,v2neighbour);
        }
    }

    public void display(){
        for(Map.Entry<Integer, LinkedList<Integer>> res : obj.entrySet()){
            System.out.println(res.getKey() + " " + res.getValue());
        }
    }
    public static void main(String[] args) {
        Graph obj = new Graph();
        obj.addEdge(0, 1, true);
        obj.addEdge(0, 4, true);
        obj.addEdge(1,2, true);
        obj.addEdge(1, 3, false);
        obj.addEdge(1, 4, true);
        obj.addEdge(2, 3, true);
        obj.addEdge(2, 4, true);
        obj.addEdge(3, 0, true);
        obj.addEdge(2, 0, true);
        obj.display();

    }
}
