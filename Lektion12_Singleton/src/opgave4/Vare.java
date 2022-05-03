package opgave4;

public abstract class Vare {
    private double pris;
    private String navn;

    public Vare(double pris, String navn){
        this.pris = pris;
        this.navn = navn;
    }

    public double getPris() {
        return pris;
    }

    public String getNavn(){
        return navn;
    }
    public void setPris(double pris){
        this.pris = pris;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }
    public abstract double beregnMoms();
}

