public class Pazza
{
    String navn;

    int pris;

    public Pazza(String navn, int pris)
    {
        this.navn = navn;
        this.pris = pris;
    }

    @Override
    public String toString()
    {
        return "Pazza{" + "navn='" + navn + '\'' + ", pris=" + pris + '}';
    }
}
