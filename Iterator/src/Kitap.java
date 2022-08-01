import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kitap {

    private String kitapAd;
    private List<Soru> soruList;

    public Kitap(String kitapAd) {
        this.kitapAd = kitapAd;
        this.soruList = new ArrayList<>();
        soruList.add(new Soru(1L));
        soruList.add(new Soru(2L));
        soruList.add(new Soru(3L));
        soruList.add(new Soru(4L));
        soruList.add(new Soru(5L));
        soruList.add(new Soru(6L));
        soruList.add(new Soru(7L));
    }

    public String getKitapAd() {
        return kitapAd;
    }

    public void setKitapAd(String kitapAd) {
        this.kitapAd = kitapAd;
    }


    public Iterator getSoruItaretor() {
        return soruList.iterator();
    }


/*

    public List<Soru> getSoruList() {
        return soruList;
    }

    public void setSoruList(List<Soru> soruList) {
        this.soruList = soruList;
    }

 */
}
