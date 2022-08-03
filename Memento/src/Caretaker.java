import java.util.ArrayList;

public class Caretaker {

    // Tüm mementoların kaydedildiği yer
    ArrayList<Memento> kaydedilmisMakaleler = new ArrayList<>();

    // Arrayliste memeto ekler
    public void addMemento(Memento memento) {
        kaydedilmisMakaleler.add(memento);
    }

    //ArrayListten istediği memento yu alır
    public Memento getMemento(int index) {
        return kaydedilmisMakaleler.get(index);
    }
}
