package MediatorKullanalım;

public class Button {

    private Mediator mediator;
    private boolean isOn = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }
    public void turnOn(){
        this.mediator.start();
        isOn = true;
    }
    public void turnOf(){
        isOn = false;
        this.mediator.stop();
    }
}
