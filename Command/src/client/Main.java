package client;

import command.MetinDosyaIsleminiAc;
import command.MetinDosyaIsleminiKaydet;
import command.MetinDosyasiIslemi;
import invoker.MetinDosyalariIslemYurutucu;
import receiver.MetinDosyasi;

public class Main {
    public static void main(String[] args) {
        MetinDosyasiIslemi metinDosyaIsleminiAc = new MetinDosyaIsleminiAc(new MetinDosyasi("dosya1.txt"));
        MetinDosyasiIslemi metinDosyasiIsleminiKaydet = new MetinDosyaIsleminiKaydet(new MetinDosyasi("dosya2.txt"));
        MetinDosyalariIslemYurutucu metinDosyalariIslemYurutucu = new MetinDosyalariIslemYurutucu();
        System.out.println(metinDosyalariIslemYurutucu.operasyonuYurutmek(metinDosyaIsleminiAc));
        System.out.println(metinDosyalariIslemYurutucu.operasyonuYurutmek(metinDosyasiIsleminiKaydet));

    }
}
