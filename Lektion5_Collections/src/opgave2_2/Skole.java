package opgave2_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Skole {
    private String navn;

    private final HashSet<Studerende> studerendes = new HashSet<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                '}';
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        studerendes.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studerendes.remove(studerende);
    }

    public double gennemsnit() {
        double sum = 0;
        for (Studerende s : studerendes) {
            sum += s.getGennemsnit();
        }
        return sum / studerendes.size();
    }

    public Studerende findStuderende(int studieNr) {
        Studerende studerende = null;
        for (Studerende s : studerendes) {
            if (s.getStudieNr() == studieNr) {
                studerende = s;
            }

        }
        return studerende;
    }
}
