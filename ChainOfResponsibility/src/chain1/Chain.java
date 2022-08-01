package chain1;

public class Chain {
    Processor chain ;

    public void buildChain(){
        chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }

    public void process (Number request){
        buildChain();
        chain.process(request);
    }
}



// chain1.Chain = Zincir