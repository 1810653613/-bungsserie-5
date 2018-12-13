package at.ac.fh_kufstein.uebung_05.Classes;

import java.sql.SQLOutput;

public class Fahrzeug
{
    private short reifen;
    private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;

    public void starten() {
        gestartet = true;
    }

    public void stoppen() {
        gestartet = false;
    }

    public void beschleunigen(short geschwindigkeit) {
        if (gestartet == true && (geschwindigkeit + this.geschwindigkeit) <= 250) {
            this.geschwindigkeit = (short) (geschwindigkeit + this.geschwindigkeit);
        } else {
            System.err.println("Ihr Fahrzeug kann nicht noch mehr beschleunigt werden");
        }
    }

    public void bremsen(short geschwindigkeit) {
        {
            if (gestartet == true && (this.geschwindigkeit - geschwindigkeit) >= 0) {
                this.geschwindigkeit = (short) (this.geschwindigkeit - geschwindigkeit);
            } else {
                System.err.println("Ihr Fahrzeug kann nicht noch mehr gebremst werden");
            }
        }
    }
}
