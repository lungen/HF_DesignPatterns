package Ch2_Observer;

public class WetterStation
{
    public static void main(String[] args)
    {
        WetterDaten wetterDaten = new WetterDaten();
        AktuelleBedingungenAnzeige aktuelleAnzeige =
            new AktuelleBedingungenAnzeige(wetterDaten);

        wetterDaten.setMessewerte(30, 30, 30);
    }
}
