public class Ogrenci {

    private SinavStratejisi sinavStratejisi;
    private EnumBolum enumBolum;

    public Ogrenci(EnumBolum enumBolum) {
        this.enumBolum = enumBolum;
        if (enumBolum == null) {
            throw new NullPointerException("Bölüm boş bırakılmaz");
        }
        switch (enumBolum) {
            case SOZEL:
                sinavStratejisi = new SozelSinavStratejisi();
                break;
            case SAYILSAL:
                sinavStratejisi = new SayisalSinavStratejisi();
                break;
            case ESİTAGIRLIK:
                sinavStratejisi = new EsitAgirlikSinavStratejisi();
                break;
            default:
                break;
        }
    }

    public String getOncelikSiralamasi() {

        System.out.println(enumBolum + " için strateji: ");

        String siralama = "Önce " + sinavStratejisi.getBirinci() + " çöz. \n" +
                "Sonra " + sinavStratejisi.getIkinci() + " çöz. \n" +
                "Daha sonra " + sinavStratejisi.getUcuncu() + " çöz. \n" +
                "En son " + sinavStratejisi.getDorduncu() + " çözersin. \n";

        return siralama;
    }
}