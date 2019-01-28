package Ch1;

public class MiniEntenSimulator
{
    public static void main(String[] args)
    {
        Ente mallard = new StockEnte();
        mallard.tuFliegen();
        mallard.tuQuaken();

        Ente modell = new ModellEnte();
        modell.tuFliegen();
        modell.setFlugVerhalten(new FliegtRaketenGetrieben());
        modell.tuFliegen();
    }
}
