package com.uptc.prg3.gui;

public enum Command {
    LOAD("Cargar laberinto","LOAD","xxx.gif","Carga una imagen de un laberinto"),
    SAVE("Grabar laberinto","SAVE","xxx.gif","Carga una imagen de un laberinto"),
    CLEAN("Limpiar laberinto","CLEAN","xxx.gif","Carga una imagen de un laberinto"),
    SEARCH_VERTEX("Buscar Vertices","SEARCH_VERTEX","xxx.gif","Carga una imagen de un laberinto"),
    SEARCH_EDGES("Buscar aristas","SEARCH_EDGES","xxx.gif","Carga una imagen de un laberinto"),
    MARK_INPUT("Marcar Entrada","MARK_INPUT","xxx.gif","Carga una imagen de un laberinto"),
    MARK_OUTPUT("Marcar salida","MARK_OUTPUT","xxx.gif","Carga una imagen de un laberinto"),
    SOLUTION_DIJKSTRA("Dijkstra","SOLUTION_DIJKSTRA","xxx.gif","Carga una imagen de un laberinto"),
    SOLUTION_BORUVKA("Boruvka","SOLUTION_BORUVKA","xxx.gif","Carga una imagen de un laberinto"),
    SOLUTION_PRIM("PRIM","SOLUTION_PRIM","xxx.gif","Carga una imagen de un laberinto"),
    SOLUTION_KRUSKAL("Kruskal","SOLUTION_KRUSKAL","xxx.gif","Carga una imagen de un laberinto"),
    SOLUTION_DFS("profundidad","SOLUTION_DFS","xxx.gif","Carga una imagen de un laberinto"),
    SOLUTION_HEURISTIC("heuristica","SOLUTION_HEURISTIC","xxx.gif","Carga una imagen de un laberinto"),
    SOLUTION_BFS("amplitud","SOLUTION_BFS","xxx.gif","Carga una imagen de un laberinto"),
    ABOUT("Acerca de...","ABOUT","xxx.gif","Carga una imagen de un laberinto"),
    HELP("Ayuda","HELP","xxx.gif","Carga una imagen de un laberinto"),
    EXIT("salir","EXIT","xxx.gif","Carga una imagen de un laberinto");
    
    private String title;
    private String command;
    private String iconFileName;
    private String hint;

    private Command(String title, String command, String iconFileName, String hint) {
        this.title = title;
        this.command = command;
        this.iconFileName = iconFileName;
        this.hint = hint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getIconFileName() {
        return iconFileName;
    }

    public void setIconFileName(String iconFileName) {
        this.iconFileName = iconFileName;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    
}
