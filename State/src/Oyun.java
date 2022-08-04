public class Oyun {
    private Console console;

    public Oyun() {
        System.out.println("Oyun Başladı");
        console = new Hucum();
    }
    public void ucgen(){
        console.ucgenBas();
    }

    public void kare(){
        console.karaBas();
    }

    public void yuvarlak(){
        console.yuvarlakBas();
    }

    public void x(){
        console.xBas();
    }

    public void topuKap(){
        System.out.println("Top kapıldı. Hücuma çıkılıyor!");
        console = new Hucum();
    }

    public void topuKaptir(){
        System.out.println("Top kaptırıldı! ");
        console = new Defans();
    }

}
