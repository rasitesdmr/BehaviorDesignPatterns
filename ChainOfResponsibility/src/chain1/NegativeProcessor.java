package chain1;

public class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void process(Number request){
        if (request.getNumber() < 0 ){
            System.out.println("Negatif işlemci :" + request.getNumber());
        }else {
            super.process(request);
        }
    }
}
