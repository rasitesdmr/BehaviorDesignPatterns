public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------");
        siralamaYazdir(EnumBolum.SAYILSAL);
        System.out.println("-------------------");
        siralamaYazdir(EnumBolum.ESİTAGIRLIK);
        System.out.println("-------------------");
        siralamaYazdir(EnumBolum.SOZEL);
        System.out.println("-------------------");

    }

    private static void siralamaYazdir(EnumBolum bolum) {
        Ogrenci ogrenci = new Ogrenci(bolum);
        String oncelikSiralamasi = ogrenci.getOncelikSiralamasi();
        System.out.println(oncelikSiralamasi);
    }
}

