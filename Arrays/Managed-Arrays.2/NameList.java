import java.util.ArrayList;

public class NameList {
    private ArrayList<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    public void removeName(String name) {
        names.remove(name);
    }

    public void displayNames() {
        System.out.println("Lista de Nomes:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
