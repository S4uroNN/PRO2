package opgave4;

public class ElVare extends Vare {

    public ElVare(double pris, String navn){
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        double moms = 0;
        if(getPris() < 10){
            moms = 3;
        }else{
            moms = getPris() * 0.3;
        }
        return moms;
    }
}
