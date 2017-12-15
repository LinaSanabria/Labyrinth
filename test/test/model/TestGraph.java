package test.model;

import java.util.Comparator;

import com.uptc.prg3.datastruct.MyGraph;
import com.uptc.prg3.datastruct.SimpleNode;
import com.uptc.prg3.datastruct.Vertex;


public class TestGraph {

	public static void main(String[] args) {
		Comparator<Vertex<String, Integer>> comparador = new Comparator<Vertex<String, Integer>>() {

			@Override
			public int compare(Vertex<String, Integer> o1, Vertex<String, Integer> o2) {
				if(o1.getInfo().compareTo(o2.getInfo())>0){
					return 1;
				}else if(o1.getInfo().compareTo(o2.getInfo()) <0){
					return -1;
				}else{					
					return 0;
				}
			}
		};
		MyGraph<String, Integer> graph = new MyGraph<>(comparador);
		graph.add("A");	graph.add("F");	graph.add("K");	graph.add("P");
		graph.add("B"); graph.add("G");	graph.add("L");	graph.add("Q");
		graph.add("C");	graph.add("H");	graph.add("M");	graph.add("R");
		graph.add("D");	graph.add("I"); graph.add("N");	graph.add("S");
		graph.add("E");	graph.add("J");	graph.add("O");	graph.add("T");

		graph.add("U");	graph.add("AA"); graph.add("AG"); graph.add("AM");
		graph.add("V");	graph.add("AB"); graph.add("AH"); graph.add("AN");	
		graph.add("W");	graph.add("AC"); graph.add("AI"); graph.add("AO");
		graph.add("X");	graph.add("AD"); graph.add("AJ"); graph.add("AP");
		graph.add("Y");	graph.add("AE"); graph.add("AK"); graph.add("AQ");
		graph.add("Z");	graph.add("AF"); graph.add("AL"); graph.add("AR");

		graph.add("AS");
		graph.add("AT");

		completeGraphs(graph);

		SimpleNode<Vertex<String, Integer>> aux = graph.amp("A", "AT").getHead();
		while(aux != null){
			System.out.print(aux.getInfo().getInfo() + " - ");
			aux = aux.getNext();
		}

	}

	public static void completeGraphs(MyGraph<String, Integer> grap){
		grap.add("A", "B", 1);	grap.add("L", "M", 1);
		grap.add("B", "C", 1);	grap.add("M", "N", 1);
		grap.add("C", "D", 1);	grap.add("M", "O", 1);
		grap.add("D", "E", 1);	grap.add("O", "P", 1);
		grap.add("D", "F", 1);	grap.add("P", "Q", 1);
		grap.add("F", "G", 1);	grap.add("Q", "R", 1);
		grap.add("G", "H", 1);	grap.add("R", "S", 1);
		grap.add("H", "I", 1);	grap.add("S", "T", 1);
		grap.add("I", "J", 1);	grap.add("T", "U", 1);
		grap.add("H", "K", 1);	grap.add("U", "V", 1);
		grap.add("K", "L", 1);	grap.add("T", "W", 1);

		grap.add("W", "X", 1); 	grap.add("AF", "AH", 1);	
		grap.add("W", "Y", 1);	grap.add("AH", "AI", 1);
		grap.add("S", "Z", 1);	grap.add("AI", "AJ", 1);
		grap.add("Z", "AA", 1);	grap.add("AJ", "AK", 1);
		grap.add("AA", "AB", 1); grap.add("AK", "AL", 1);
		grap.add("AB", "AC", 1); grap.add("AK", "AM", 1);
		grap.add("AC", "AD", 1); grap.add("AJ", "AN", 1);
		grap.add("AD", "AE", 1); grap.add("AN", "AO", 1);
		grap.add("AE", "AF", 1); grap.add("AO", "AP", 1);
		grap.add("AF", "AG", 1); grap.add("AP", "AQ", 1);

		grap.add("AQ", "AR", 1);
		grap.add("AR", "AS", 1);
		grap.add("AS", "AT", 1);

	}
}
