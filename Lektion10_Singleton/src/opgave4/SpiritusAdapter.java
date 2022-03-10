package opgave4;

public class SpiritusAdapter extends Vare{
    private Spiritus spiritus;

    public SpiritusAdapter(Spiritus spiritus){
        super(spiritus.getPrisen(),spiritus.getBetgenelse());
        this.spiritus = spiritus;

    }

    @Override
    public double beregnMoms() {
        return spiritus.hentMoms();
    }
}
