import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Matematik");
        Defter defter = new Defter("Türkçe");

        Iterator soruIteratorKitap = kitap.getSoruItaretor();
        Iterator soruIteratorDefter = defter.getSoruIterator();

        yazdir(soruIteratorKitap);
        yazdir(soruIteratorDefter);
    }

    private static void yazdir(Iterator soruIteratorKitap){
        while (soruIteratorKitap.hasNext()){
            Soru soru = (Soru) soruIteratorKitap.next();
            Long soruNo = soru.getSoruNumarasi();
            System.out.println("Soru no :" + soruNo);
        }
    }
}
