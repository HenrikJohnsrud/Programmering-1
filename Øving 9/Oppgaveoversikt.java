import java.util.Arrays;

public class Oppgaveoversikt {

    private Student[] studenter;
    private int antStud = 0;

    public Oppgaveoversikt(){
        studenter=new Student[1];
    }

    public int getAntStud() {
        return antStud;
    }

    public int antOppgStudent(String navn){
        String student = navn.toLowerCase();
        int antOppg = 0;
        for(int i = 0; i<antStud; i++){
            if (student.equals(studenter[i].getNAVN())){
                antOppg=studenter[i].getAntOppg();
            }
        }
        return antOppg;
    }

    public String registrerStudent(String navn, int antOppg){
        String student = navn.toLowerCase();
        if (!navnTest(student)) { //hvis navnTest er false finnes ikke navnet
            if (studenter.length == antStud) {
                utvidTabell();
            }
            studenter[antStud] = new Student(student, antOppg);
            antStud++;
            return "Registrering fullført";
        }
        return "Registrering misslykktes, navnet finnes allerede i systemet";
    }

    public boolean navnTest(String navn){//sjekker om navnet allerede finnes i systemet
        for(int i = 0; i< antStud; i++){
            if (navn.equals(studenter[i].getNAVN())){
                return true;
            }
        }
        return false;
    }

    public void utvidTabell(){
        Student[] midlertidigListe = new Student[antStud + 1];

        for (int i = 0; i < antStud; i++) {
            midlertidigListe[i] = studenter[i];
        }
        studenter = midlertidigListe;

    }

    public void oekAntOppgStudent(String navn, int antOppg){
        String name = navn.toLowerCase();
        for(int i = 0; i < antStud; i++){
            if(studenter[i].getNAVN().equals(name)){
                studenter[i].setAntOppg(antOppg);
            }
        }
    }

    @Override
    public String toString() {
        return "Det er " + antStud + " i dette registret";
    }
}
