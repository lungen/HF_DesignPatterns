package Ch2_Observer;

public interface Subjekt
{
    public void registriereBeobachter(Beobachter b);
    public void entferneBeobachter(Beobachter b);
    public void benachrichtigeBeobachter();
}
