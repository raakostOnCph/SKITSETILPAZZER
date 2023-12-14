public class Kunde
{

    private String navn;

    private Odre odre;

    public Kunde(String navn)
    {
        this.navn = navn;
        this.odre = new Odre();
    }

    public String getNavn()
    {
        return navn;
    }



    public Odre getOdre()
    {
        return odre;
    }


}
