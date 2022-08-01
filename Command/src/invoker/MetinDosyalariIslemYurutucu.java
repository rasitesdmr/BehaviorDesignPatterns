package invoker;

import command.MetinDosyasiIslemi;

import java.util.ArrayList;
import java.util.List;

public class MetinDosyalariIslemYurutucu {

   private final List<MetinDosyasiIslemi> metinDosyasiIslemiList = new ArrayList<>();

    public String operasyonuYurutmek(MetinDosyasiIslemi metinDosyasiIslemi){
       metinDosyasiIslemiList.add(metinDosyasiIslemi);
        return metinDosyasiIslemi.uygulamak();
    }
}
