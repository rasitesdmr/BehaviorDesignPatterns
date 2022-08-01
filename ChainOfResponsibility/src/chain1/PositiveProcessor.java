package chain1;

public class PositiveProcessor extends Processor{
    public PositiveProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void process(Number request){
        if (request.getNumber() > 0){
            System.out.println("Pozitif işlemci : " + request.getNumber());
        }else {
            super.process(request);
        }
    }
}
