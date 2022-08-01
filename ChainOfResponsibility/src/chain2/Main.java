package chain2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
        do {
            System.out.print("Çekilecek Tutarı Girin (Uyarı : 10'un katları olacak ) ve enter tuşuna basın : ");
            int tutar  = input.nextInt();
            if (gecerli(tutar)){
                AtmParaCekme.geriCekmek(new KagitParaBirimi(tutar));
            }
        }while (true);
        }
    }
    private static boolean gecerli(int tutar){
        if (tutar <= 0){
            System.out.println(" UYARI : Geçersiz mikter tekrar deneyin. ");
            return false;
        }else if (tutar > 10000){
            System.out.println("UYARI : Günlük para çekme limiti 10000 TL tekrar deneyin");
        } else if (tutar % 10 != 0 ) {
            System.out.println("UYARI : Tutar 10 'un katı olmalıdır tekrar deneyin ");
        }
        return true;
    }
}
