package singleton;

import java.util.ArrayList;

public class Undo {
    private static Undo INSTANCE;
    private ArrayList<String> commandHistory = new ArrayList<>();

    //Constructor
    private Undo() {
    }

    //Factory method
    public static Undo getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Undo();
        }
        return INSTANCE;
    }

    public void addCommand(String command){
        this.commandHistory.add(command);
        System.out.println("Comando añadido al historial.");
    }
    public void undoCommand(){
        this.commandHistory.remove(commandHistory.size() - 1);
        System.out.println("Último comando borrado del historial.");
    }
    public void showHistory(){
        System.out.println(this.commandHistory.toString());
    }

    // getters and setters
}
