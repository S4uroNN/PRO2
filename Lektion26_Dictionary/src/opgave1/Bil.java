package opgave1;

import java.util.Objects;

public class Bil {
    private String  regNr, maerke, model, farve;

    public Bil(String regNr,String maerke, String model, String farve){
        this.regNr = regNr;
        this.maerke = maerke;
        this.model = model;
        this.farve = farve;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMaerke() {
        return maerke;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regNr='" + regNr + '\'' +
                ", maerke='" + maerke + '\'' +
                ", model='" + model + '\'' +
                ", farve='" + farve + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return regNr.equals(bil.regNr) && maerke.equals(bil.maerke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNr, maerke, model, farve);
    }
}
