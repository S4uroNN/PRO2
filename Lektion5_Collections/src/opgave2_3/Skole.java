package opgave2_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Skole {
    private String navn;

    private final HashMap<Integer,Studerende> studerendes = new HashMap<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Skolenavn: " +
                navn ;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        studerendes.put(studerende.getStudieNr(),studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studerendes.remove(studerende.getStudieNr());
    }

    public double gennemsnit() {
        double sum = 0;
        for(Studerende s: studerendes.values()){
            sum+= s.getGennemsnit();
        }
        return sum / studerendes.size();
    }

    public Studerende findStuderende(int studieNr) {
        return studerendes.get(studieNr);
    }
}
