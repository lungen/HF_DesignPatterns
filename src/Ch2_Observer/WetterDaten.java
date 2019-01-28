package Ch2_Observer;

import java.util.*;

public class WetterDaten implements Subjekt
{
    private ArrayList<Beobachter> beobachter;
    private float temperatur;
    private float feuchtigkeit;
    private float luftdruck;

    public WetterDaten()
    {
        beobachter = new ArrayList<Beobachter>();
    }

    public void registriereBeobachter(Beobachter b)
    {
        this.beobachter.add(b);
    }

    public void entferneBeobachter(Beobachter b) {
        int i = beobachter.indexOf(b);

        if (i >= 0) {
            beobachter.remove(i);
        }
    }

    public void benachrichtigeBeobachter() {
        for (int i = 0; i < beobachter.size(); i++)
        {
            Beobachter b = (Beobachter)beobachter.get(i);
            b.aktualisieren(temperatur, feuchtigkeit, luftdruck);
        }
    }

    public void messwerteGeaendert() {
        this.benachrichtigeBeobachter();
    }

    public void setMessewerte(float temp, float feucht, float druck) {
        this.temperatur = temp;
        this.feuchtigkeit = feucht;
        this.luftdruck = druck;
        this.messwerteGeaendert();
    }
}
