import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class Odre
{
    String tidspunkt;

   private int total =0;

  private ArrayList<Pazza> pazzaArrayList = new ArrayList<>();

  Map<Integer, Pazza> pazzaMap;


    public Odre()  /// overveje at lave en klasse menykort som rummer det her.
    {
        Map<Integer, Pazza> pazzaMap = new TreeMap<>();

        pazzaMap.put(1,new Pazza("hawaii", 45));
        pazzaMap.put(2,new Pazza("vezu", 145));
        pazzaMap.put(3,new Pazza("calzone", 67));

        this.pazzaMap = pazzaMap;
    }

    public String getTidspunkt()
    {
        return tidspunkt;
    }

    public int getTotal()
    {
        return total;
    }

    public ArrayList<Pazza> getPazzaArrayList()
    {
        return pazzaArrayList;
    }

    public int indsætPazza(int i) {

        Pazza p = pazzaMap.get(i);

      pazzaArrayList.add(p);

      total = total + p.pris;

      return total;

  }

  public Pazza fjernPizza ( int i) {

        String pazzaNavn = pazzaMap.get(i).navn;

      for (Pazza pazza : pazzaArrayList) {

          if (pazza.navn.equals(pazzaNavn)) {
              pazzaArrayList.remove(pazza);
              total = total - pazza.pris;
              return pazza;
          }

      }
      return null;
  }




}
