package opgave2_2;

import java.util.ArrayList;
import java.util.List;

public class Studerende {
    private int studieNr;
    private String navn;
    private final List<Integer> karakteres = new ArrayList<Integer>();

    public Studerende(int studieNr, String navn){
        this.studieNr = studieNr;
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Studerende: " +
                "studieNr= " + studieNr +
                ", navn= '" + navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public void setStudieNr(int studieNr) {
        this.studieNr = studieNr;
    }

    public List<Integer> getKarakter() {
        return new ArrayList<>(karakteres);
    }

    public void addKarakter(int karakter){
        karakteres.add(karakter);
    }

    public double getGennemsnit(){
        double sum = 0;
        for(int i = 0; i<karakteres.size();i++){
            sum += karakteres.get(i);

        }
        return sum/karakteres.size();
    }
}
