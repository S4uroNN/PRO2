package bibliotek;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bibliotek {
    public int beregnBøde(LocalDate beregnDato, LocalDate faktiskDato, boolean voksen) {
        int bøde = 0;
        int bødedage = (int) (ChronoUnit.DAYS.between(beregnDato, faktiskDato));
        if(voksen){
            if(bødedage <= 7){
                bøde = 20*bødedage;
            }else if(bødedage <= 14) {
                bøde = 60 * bødedage;
            }else{
                bøde = 90 * bødedage;
            }
        }else if(!voksen){
            if(bødedage <= 7){
                bøde = 10*bødedage;
            }else if(bødedage <= 14) {
                bøde = 30 * bødedage;
            }else{
                bøde = 45 * bødedage;
            }
        }
        return bøde;
    }
}
