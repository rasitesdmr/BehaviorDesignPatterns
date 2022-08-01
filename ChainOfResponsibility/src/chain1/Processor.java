package chain1;

public abstract class Processor {

    // Bir sonraki zincire geçmesi için
    private Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public  void process(Number request){
        if(nextProcessor != null){
            nextProcessor.process(request);
        }
    }
}



// chain1.Processor : İşlemci