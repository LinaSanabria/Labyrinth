package com.uptc.prg3.datastruct;

public class Vertex <V,A> {
    protected V info;
    protected SimpleList <Edge<V,A>> edges;

    public Vertex(V info) {
        this.info = info;
        this.edges = new SimpleList<>();
    }
  
}
