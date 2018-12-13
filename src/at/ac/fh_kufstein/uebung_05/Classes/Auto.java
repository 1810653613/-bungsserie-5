package at.ac.fh_kufstein.uebung_05.Classes;

public class Auto extends Fahrzeug
{
private boolean klimaanlage;
private short airbags;

public void klimaanlageAn()
{
if(klimaanlage==false)
{
    klimaanlage=true;
}
else
    {
     System.err.println("Die Klimaanlage läuft bereits.");
    }
}

public void klimaanlageAus()
{
    if(klimaanlage==true)
    {
        klimaanlage=false;
    }
else
    {
        System.err.println("Die Klimaanlage ist bereits ausgeschalten.");
    }
}
}
