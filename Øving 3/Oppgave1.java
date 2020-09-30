import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        
        System.out.println("Fyll inn startverdien");
        int start = inn.nextInt();
        System.out.println("Fyll inn sluttverdin");
        int slutt = inn.nextInt();

        String ut;
    
        if (slutt > start){
            for (int i = start; i <= slutt; i++) {
                for (int j = 0; j < 11; j++) {
                    if (j==0){ //Legger til teksten i starten av tabellen
                        ut = i + "-gangen:";
                    }
                   else{
                       ut = j + " * " + i + " = " +(j*i);
                   }
                    System.out.println( ut );
                }
            }
        }
        else {
            System.out.println("Det første tallet må være mindre enn det andre");
        }
    }
}
