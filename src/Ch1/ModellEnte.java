package Ch1;

public class ModellEnte extends Ente
{
    public ModellEnte()
    {
        flugVerhalten = new FliegtGarNicht();
        quakVerhalten = new Quaken();
    }

    public void anzeigen()
    {
        System.out.println("Ich bin eine ModellEnte");
    }
}
