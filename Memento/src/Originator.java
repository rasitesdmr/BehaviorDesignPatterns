public class Originator {
    private String makale;

    // Makalenin değerini ayarlar .
    public void set(String yeniMakale) {
        System.out.println("Gönderen : Makalenin güncel sürümü\n " + yeniMakale + "\n");
        this.makale = yeniMakale;
    }
    // Yeni bir makale ile yeni bir Memento oluşturur.
    public Memento memenoMagazasi(){
        System.out.println("Gönderen : Memento kayıt etme");
        return new Memento(makale);
    }
    // Şu anda memento da saklanan makaleyi al
    public String mementodanGeriYukle(Memento memento) {
        makale = memento.kaydedilmismakaleyiAl();
        System.out.println("Gönderen : Önceki makale mementoya kaydedildi\n" + makale + "\n");
        return makale;
    }
}
