package at.ac.fh_kufstein.uebung_05.Classes;

public class Wasserfahrzeug extends Fahrzeug
{
private double tiefgang;
private short schrauben;
private Double ladung;

public void entladen() throws InterruptedException {
    if(ladung>=0)
    {
            Thread.sleep(5000);
            ladung=0.0;
    }
    else
    {
        System.err.println("Die Ladung wurde bereits entladen");
    }
}
}
