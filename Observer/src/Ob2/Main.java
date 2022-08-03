package Ob2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal min = BigDecimal.valueOf(23);
        BigDecimal max = BigDecimal.valueOf(28);
        Thermometer thermometer = new Thermometer(min , max);

        Family father = new Family("Baba ");
        Family mother = new Family("Anne ");

        thermometer.add(father);
        thermometer.add(mother);

        for (int i = thermometer.getMomentary().intValue(); i <=30; i++){
            thermometer.setMomentary(BigDecimal.valueOf(i));
        }
        for (int i = thermometer.getMomentary().intValue(); i >=22; i--){
            thermometer.setMomentary(BigDecimal.valueOf(i));
        }
    }
}
