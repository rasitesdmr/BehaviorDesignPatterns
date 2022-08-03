package Ob2;

public class Family implements Observer{

    private String name ;

    public Family(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        Thermometer thermometer = (Thermometer) observable;
        System.out.println(name + "dedi ki  : Sıcaklık " + thermometer.getMomentary() + " derece olmuş !");
    }
}
