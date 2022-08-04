import java.util.Date;

public class AnadoluLisesiDilekce extends DevamsizlikDilekceTemplate{

    private String sinif;
    private String numara;
    private String isim;

    public AnadoluLisesiDilekce(String sinif, String numara, String isim) {
        this.sinif = sinif;
        this.numara = numara;
        this.isim = isim;
    }
    @Override
    public Date getTarih() {
        return new Date();
    }

    @Override
    public String getKurumAdi() {
        return "Sivas Anadolu Lisesi";
    }

    @Override
    public String getSehir() {
        return "Sivas";
    }

    @Override
    public String getSinifAdi() {
        return "10-A ";
    }

    @Override
    public String getOkulNumarasi() {
        return "200156";
    }

    @Override
    public String getOgrenimYili() {
        return "2022";
    }

    @Override
    public String getYariyil() {
        return "Birinci";
    }

    @Override
    public String getOgrenciAdSoyad() {
        return "Muhammed Raşit Eşdemir";
    }
}
