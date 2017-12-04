package com.uptc.prg3.datastruct;
public class MyGraph <V,E> {
   private SimpleList <Vertex <V,E>> vertexs; 
   
    public MyGraph() {
        vertexs = new SimpleList<>();
    }

    public SimpleList<Vertex<V, E>> getVertexs() {
        return vertexs;
    }
   
    public void add(V info){
       vertexs.add(new Vertex(info));
    }
//    
//    public void add(T home, T target, L label){
//        // recorre la lista buscando...
////        SimpleNode <Vertex <T,L>> simpleNode = vertexs.find(target);
////        while(simpleNode!=null && (simpleNode.getInfo().getInfo().compareTo(home)) ){
////           simpleNode = simpleNode.getNext();
////        }
//        
//      // buscar el vertice home... si no crea
//      // buscar el target... si no crea
//      // origen.add(new Edge(target,label));
//    }
//    
//    public SimpleList <Vertex<T,L>> DFS(Vertex <T,L> home){
//        SimpleList <Vertex<T,L>>  simpleListVisited = new SimpleList<>();
//        MyStack <Vertex<T,L>> myStack = new MyStack();
//        Vertex <T,L> vertex = vertexs.find(home); // si no esta??
//        do {
//           simpleListVisited.add(vertex);
//           if (!vertex.getEdges().isEmpty()){
//              // elegir una de la lista...
//              SimpleNode <Edge <L,T>> simpleNode = vertex.getEdges().getHead();
//              while(simpleNode!=null){
//                 Vertex <L,T> auxvertex = simpleNode.getInfo().getTarget();
//                 if (simpleListVisited.isIn((Vertex<T, L>) auxvertex)){
//                 
//                 }
//                 else {
//                 
//                 }
//              }
//              myStack.push(vertex);
//           } 
//           else {
//             vertex = myStack.pop();           
//           }
//        } while(!myStack.isEmpty());
//       return null;
//        
//    } 
//    
//    public SimpleList <Vertex<T,L>> amp(Vertex <T,L> home){
//       return null;
//       //to do ..
//    } 
//    
//    public SimpleList<T>  diskjtra(Vertex vertex){
//       return null;
//    
//    }
}
