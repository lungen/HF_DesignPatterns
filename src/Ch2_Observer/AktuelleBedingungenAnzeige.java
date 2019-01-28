package Ch2_Observer;

public class AktuelleBedingungenAnzeige implements Beobachter, AnzeigeElement
{
    private float temperatur;
    private float feuchtigkeit;
    Subjekt wetterDaten;

    public AktuelleBedingungenAnzeige(Subjekt wetterDaten)
    {
        this.wetterDaten = wetterDaten;
        wetterDaten.registriereBeobachter(this);
    }

    public void aktualisieren(float temp, float feucht, float druck)
    {
        this.temperatur = temp;
        this.feuchtigkeit = feucht;
        this.anzeigen();
    }


    public void anzeigen() 
    {
        System.out.println("Akuelles Wetter: " + temperatur + " °Celsius. Feuchtigkeit: " +
                + feuchtigkeit);
    }

}
