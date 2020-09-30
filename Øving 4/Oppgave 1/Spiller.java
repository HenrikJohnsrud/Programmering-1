import java.util.Random;

public class Spiller {

    private java.util.Random terning= new java.util.Random();
    private int sum;

    public Spiller() {
    }

    public int getSum() {
        return this.sum;
    }

    public int kastTerningen() {
        int kast = terning.nextInt(6) + 1;
        if (kast == 1) {
             return sum = 0;
        }
        return sum += kast;
    }

    public boolean erFerdig(){
        boolean ferdig;
        if (this.sum< 100){
            ferdig = false;
        }
        else {
            ferdig = true;
        }
        return ferdig;
    }

}
