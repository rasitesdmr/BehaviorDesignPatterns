package MediatorKullanmayalim;

public class Button {
    private Fan fan;

    public Button(Fan fan) {
        this.fan = fan;
    }

    public Fan getFan() {
        return fan;
    }
    public void press(){
        if (fan.isOn()){
            fan.turnOf();
        }else {
            fan.turnOn();
        }
    }
}
