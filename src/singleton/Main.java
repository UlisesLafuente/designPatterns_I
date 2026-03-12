package singleton;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");
        undo.showHistory();
// Output: mkdir carpeta, cd carpeta

        undo.undoCommand();
        undo.showHistory();
// Output: mkdir carpeta
    }
}
