import static javax.swing.JOptionPane.*;

    public class Oppgave2 {
        public static void main(String[] args){         
        int m=0;
        int choice;
     
        do {
            int test=0;  

            String tall = showInputDialog("Hvilke tall skal du teste?");
            int n= Integer.parseInt(tall);
            m=n-1;      

            if( n==0 || n==1 ){  // Tallene 1 og 0 er ikke primtall
                showMessageDialog(null, n+" er ikke et primtall");
            }
            else{  
                for(int i = 2; i <= m; i++ ){      
                    if( n%i == 0 ){ //Sjekker om tallet er delelig på noe annet enn seg selv og 1
                        showMessageDialog(null, n+" er ikke et primtall");
                        test=1;      
                        break;  //Hopper ut av løkken, siden if --> true og tallet ikke er primtall    
                    }      
                }      
                if(test==0)  {showMessageDialog(null, n+" er et primtall :)");}  //Hvis tallet kom seg gjennom løkka uten å bli registret som "ikke primtall" vil det havne her
            } 
            choice = showConfirmDialog(null, "Ønsker du å teste et nytt tall?", "Primtallstest", YES_NO_OPTION); //Spør om brukeren vil kjøre programmet på nytt
        }
        while (choice == YES_OPTION); 
        }
    }
