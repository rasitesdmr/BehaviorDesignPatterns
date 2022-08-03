package Ob2;

import java.math.BigDecimal;

public class Thermometer extends Observable {
    private BigDecimal momentary;
    private BigDecimal max;
    private BigDecimal min;

    public Thermometer(BigDecimal min, BigDecimal max) {
        this.min = min;
        this.max = max;
        this.momentary = BigDecimal.valueOf(24);
    }

    public BigDecimal getMomentary() {
        return momentary;
    }

    public void setMomentary(BigDecimal momentary) {
        this.momentary = momentary;
        System.out.println(momentary);
        controlTemperature();
    }

    public void controlTemperature() {
        boolean maxC = momentary.compareTo(max) >= 0;
        boolean minC = momentary.compareTo(min) <= 0;
        if (maxC || minC) {
            letMeKnow();
        }
    }
}
