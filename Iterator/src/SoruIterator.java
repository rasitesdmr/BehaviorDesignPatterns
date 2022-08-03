import java.util.Iterator;

public class SoruIterator implements Iterator {

    private Soru[] sorular;
    private int sira;

    public SoruIterator(Soru[] sorular) {
        this.sorular = sorular;
    }

    @Override
    public boolean hasNext() {
        if (sira < sorular.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return sorular[sira++];
        }
        return null;
    }
}
