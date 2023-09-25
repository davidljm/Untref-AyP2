package ayp2.clase19;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import java.util.Collection;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Graph {
  class GraphException extends RuntimeException {
    public GraphException(String name) {
      super(name);
    }
  }

  class Edge {
    public Vertex dest;   // Second vertex in Edge

    public Edge(Vertex d) {
      dest = d;
    }
  }

  // Represents a vertex in the graph.
  class Vertex {
    public String     name;   // Vertex name
    public List<Edge> adj;    // Adjacent vertices
    public double     dist;   // Cost
    public Vertex     prev;   // Previous vertex on shortest path

    public Vertex(String nm) {
      name = nm;
      adj = new LinkedList<Edge>();
      reset();
    }

    public void reset() {
      dist = Graph.INFINITY;
      prev = null;
    }
  }

  public static final double INFINITY = Double.MAX_VALUE;
  private Map<String,Vertex> vertexMap = new HashMap<String,Vertex>();

  public void addEdge(String sourceName, String destName) {
    Vertex v = getVertex(sourceName);
    Vertex w = getVertex(destName);
    v.adj.add(new Edge(w));
  }

  public void printPath(String destName) {
    Vertex w = vertexMap.get(destName);

    if(w == null) {
      throw new NoSuchElementException("Vertice destino no encontrado");
    }
    else if(w.dist == INFINITY) {
      System.out.println(destName + " no es alcanzable");
    }
    else {
      System.out.print("(El costo es: " + w.dist + ") ");
      printPath(w);
      System.out.println();
    }
  }

  public int vertexCount() {
    return vertexMap.size();
  }

  private Vertex getVertex(String vertexName) {
    Vertex v = vertexMap.get(vertexName);

    if(v == null) {
      v = new Vertex(vertexName);
      vertexMap.put(vertexName, v);
    }

    return v;
  }

  private void printPath(Vertex dest) {
    if(dest.prev != null) {
      printPath(dest.prev);
      System.out.print(" a ");
    }

    System.out.print(dest.name);
  }

  private void clearAll() {
    for(Vertex v : vertexMap.values()) {
      v.reset();
    }
  }

  public void breadthFirstSearch(String startName) {
    clearAll();

    Vertex start = vertexMap.get(startName);
    if(start == null) {
      throw new NoSuchElementException("Vertice inicial no encontrado");
    }

    Deque<Vertex> queue = new ArrayDeque<Vertex>();
    queue.addLast(start);
    start.dist = 0;

    System.out.println("Recorrido BFS empezando por: " + start.name);

    while(queue.size() > 0) {
      Vertex v = queue.removeFirst();
      System.out.println("Visita vertice " + v.name);

      for(Edge e : v.adj) {
        Vertex w = e.dest;

        if(w.dist == INFINITY) {
          w.dist = v.dist + 1;
          w.prev = v;
          queue.addLast(w);
        }
      }
    }
  }

  public void depthFirstSearch(String startName) {
    clearAll();

    Vertex start = vertexMap.get(startName);
    if(start == null) {
      throw new NoSuchElementException("Vertice inicial no encontrado");
    }

    Deque<Vertex> stack = new ArrayDeque<Vertex>();
    stack.addFirst(start);
    start.dist = 0;

    System.out.println("Recorrido DFS empezando por: " + start.name);

    while(stack.size() > 0) {
      Vertex v = stack.removeFirst();
      System.out.println("Visita vertice " + v.name);

      for(Edge e : v.adj) {
        Vertex w = e.dest;

        if(w.dist == INFINITY) {
          w.dist = v.dist + 1;
          w.prev = v;
          stack.addFirst(w);
        }
      }
    }
  }

  public static boolean processRequest(Scanner in, Graph g) {
    try {
      System.out.print("Ingresar nodo inicial: ");
      String startName = in.nextLine();

      System.out.print("Ingresar nodo destino: ");
      String destName = in.nextLine();

      // g.breadthFirstSearch(startName);
      g.depthFirstSearch(startName);

      g.printPath(destName);
    }
    catch(NoSuchElementException e) {
      return false;
    }
    catch(GraphException e) {
      System.err.println(e);
    }

    return true;
  }

  public static void main(String [ ] args) {
    Graph g = new Graph();
    try {
      FileReader fin = new FileReader(args[0]);
      Scanner graphFile = new Scanner(fin);

      // Read the edges and insert
      String line;
      while(graphFile.hasNextLine()) {
        line = graphFile.nextLine();
        StringTokenizer st = new StringTokenizer(line);

        try {
          if(st.countTokens() != 2) {
            System.err.println("Salteando linea con formato incorrecto " + line);
            continue;
          }
          String source = st.nextToken();
          String dest = st.nextToken();
          g.addEdge(source, dest);
        }
        catch(NumberFormatException e) {
          System.err.println("Salteando linea con formato incorrecto " + line);
        }
      }
    }
    catch(IOException e) {
      System.err.println(e);
    }

    System.out.println("Leyendo archivo...");
    System.out.println(g.vertexCount() + " vertices");

    Scanner in = new Scanner(System.in);
    while(processRequest(in, g));
  }
}
