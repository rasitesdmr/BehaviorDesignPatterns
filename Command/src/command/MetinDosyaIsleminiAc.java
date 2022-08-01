package command;

import receiver.MetinDosyasi;

public class MetinDosyaIsleminiAc implements MetinDosyasiIslemi{

    private final MetinDosyasi metinDosyasi;

    public MetinDosyaIsleminiAc(MetinDosyasi metinDosyasi) {
        this.metinDosyasi = metinDosyasi;
    }

    @Override
    public String uygulamak() {
        return metinDosyasi.ac();
    }
}
