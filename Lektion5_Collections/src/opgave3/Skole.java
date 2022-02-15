package opgave3;

import java.util.ArrayList;
import java.util.List;

public class Skole {
    private String navn;

    private final List<Studerende> studerendes = new ArrayList<Studerende>();

    public Skole (String navn){
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

    public void addStuderende(Studerende studerende){
        if(!studerendes.contains(studerende)){
            studerendes.add(studerende);
        }
    }
    public void removeStuderende(Studerende studerende){
        studerendes.remove(studerende);
    }

    public double gennemsnit(){
        double sum = 0;
        for(int i = 0; i<studerendes.size();i++){
            sum += studerendes.get(i).getGennemsnit();
        }
        return sum / studerendes.size();
    }

    public Studerende findStuderende(int studieNr){
        Studerende studerende = null;
        int i = 0;
        while(studerende == null && i<studerendes.size()){
            if(studerendes.get(i).getStudieNr() == studieNr){
                studerende = studerendes.get(i);
            } else {
                i++;
            }
        }
        return studerende;
    }
}
