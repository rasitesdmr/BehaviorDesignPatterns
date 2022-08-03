package MediatorKullanmayalim;

public class Fan {

    private Button button;
    private PowerSupplier powerSupplier;
    private boolean isOn = false;

    public Fan(Button button, PowerSupplier powerSupplier, boolean isOn) {
        this.button = button;
        this.powerSupplier = powerSupplier;
        this.isOn = isOn;
    }

    public Button getButton() {
        return button;
    }

    public PowerSupplier getPowerSupplier() {
        return powerSupplier;
    }

    public boolean isOn() {
        return isOn;
    }
    public void turnOn(){
        powerSupplier.turnOn();
        isOn = true;
    }
    public void turnOf(){
        powerSupplier.turnOf();
        isOn = false;
    }

}
