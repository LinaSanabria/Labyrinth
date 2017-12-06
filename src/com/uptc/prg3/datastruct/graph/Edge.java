package com.uptc.prg3.datastruct.graph;

public class Edge <V,E> {
   protected E label;
   protected Vertex <V,E> target;

    public Edge(E label, Vertex<V, E> target) {
        this.label = label;
        this.target = target;
    }
}
