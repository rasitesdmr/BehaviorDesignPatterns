import java.util.Date;

public class FenLisesiDilekce extends DevamsizlikDilekceTemplate{

    private String sinif;
    private String numara;
    private String isim;
    private String sube;

    public FenLisesiDilekce(String sinif, String numara, String isim, String sube) {
        this.sinif = sinif;
        this.numara = numara;
        this.isim = isim;
        this.sube = sube;
    }

    @Override
    public Date getTarih() {
        return new Date();
    }

    @Override
    public String getKurumAdi() {
        return "Sivas Fen Lisesi";
    }

    @Override
    public String getSehir() {
        return "Sivas";
    }

    @Override
    public String getSinifAdi() {
        return "12-A";
    }

    @Override
    public String getOkulNumarasi() {
        return "35954";
    }

    @Override
    public String getOgrenimYili() {
        return "2028";
    }

    @Override
    public String getYariyil() {
        return "İkinci";
    }

    @Override
    public String getOgrenciAdSoyad() {
        return "Muhammed Eşdemir";
    }
}
