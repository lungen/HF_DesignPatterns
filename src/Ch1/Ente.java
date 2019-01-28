package Ch1;

public abstract class Ente {

    Flugverhalten flugVerhalten;
    Quakverhalten quakVerhalten;

    public Ente() {
    }

    public void tuFliegen() {
        flugVerhalten.fliegen();
    }

    public void tuQuaken() {
        quakVerhalten.quaken();
    }

    public void schwimmen() {
        System.out.println("Alle Enten schwimmen, auch Holzenten");
    }

    public void setFlugVerhalten(Flugverhalten fv)
    {
        this.flugVerhalten = fv;
    }

    public void setQuakVerhalten(Quakverhalten qv)
    {
        this.quakVerhalten = qv;
    }
}
