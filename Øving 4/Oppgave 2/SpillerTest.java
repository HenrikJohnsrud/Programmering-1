
public class SpilleTest {

    public static void main(String[] args){

        int runde = 1;
        String vinnerSpiller;
        int vinnerPoeng;

        String spillerA = "Henrik";
        String spillerB = "Trym";

        Spiller spiller_A = new Spiller();
        Spiller spiller_B = new Spiller();


        while (!spiller_A.erFerdig() && !spiller_B.erFerdig()) {
            for (int i=0; i<2; i++){
                if (i==0){
                    System.out.println("Runde nr: " + runde + ". " + spillerA + " har " + spiller_A.kastTerningen() + " poeng");
                }
                else{
                    System.out.println("Runde nr: " + runde + ". " + spillerB + " har " + spiller_B.kastTerningen() + " poeng");
                }
            }
            runde++;
        }
        if (spiller_A.getSum() > spiller_B.getSum()){
            vinnerSpiller = spillerA;
            vinnerPoeng = spiller_A.getSum();
        }
        else if (spiller_B.getSum() > spiller_A.getSum()){
            vinnerSpiller = spillerB;
            vinnerPoeng = spiller_B.getSum();
        }
        else {
            vinnerSpiller = "både " + spillerA + " og " + spillerB;
            vinnerPoeng = spiller_A.getSum();
        }
        System.out.println("Vinneren av denne runden ble: " + vinnerSpiller + " med " + vinnerPoeng + " poeng!");
    }
}
