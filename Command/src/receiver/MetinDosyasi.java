package receiver;

public class MetinDosyasi {

    private final String name;

    public MetinDosyasi(String name) {
        this.name = name;
    }

    public String ac() {
        return "Dosya açma " + name;
    }

    public String okuma() {
        return "Dosya okuma " + name;
    }

    public String yazma() {
        return "Dosya yazma " + name;
    }

    public String kaydetme() {
        return "Dosya kayıt " + name;
    }

    public String kopyalamak() {
        return "Kopyalamak" + name;
    }

    public String yapistirmak() {
        return "Yapıştırmak " + name;
    }
}
