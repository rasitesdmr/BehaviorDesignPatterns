public class Main {
    public static void main(String[] args) {

        AnadoluLisesiDilekce anadoluLisesiDilekce =
                new AnadoluLisesiDilekce("10-A", "6266", "Muhammed Raşit Eşdemir");

        FenLisesiDilekce fenLisesiDilekce = new FenLisesiDilekce("12    ", "5789", "Muhammed Eşdemir",
                "A");

        anadoluLisesiDilekce.dilekceYazdir();
        System.out.println("\n\n");
        fenLisesiDilekce.dilekceYazdir();
    }
    }

