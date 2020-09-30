import java.util.Random;

public class TilfeldigTeller {
    public static void main(String[] args) {

        java.util.Random tilfeldig = new java.util.Random();

        int[] antall = new int[10];


        for (int i = 0; i < 1000; i++){
            int tall = tilfeldig.nextInt(10);
            antall[tall]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " finnes " + antall[i] + " ganger i tabellen");
        }
    }
}
