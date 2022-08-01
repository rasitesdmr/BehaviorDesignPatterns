package command;

import receiver.MetinDosyasi;

public class MetinDosyaIsleminiKaydet implements MetinDosyasiIslemi {

    private final MetinDosyasi metinDosyasi;

    public MetinDosyaIsleminiKaydet(MetinDosyasi metinDosyasi) {
        this.metinDosyasi = metinDosyasi;
    }

    @Override
    public String uygulamak() {
        return metinDosyasi.kaydetme();
    }
}
