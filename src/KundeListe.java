import java.util.Map;
import java.util.TreeMap;

public class KundeListe
{

    Map<String, Kunde> kunderMap = new TreeMap<>();

    public boolean indsætKunde(Kunde kunde) {

        if (kunderMap.containsKey(kunde.getNavn())) {
            return false;
        }
        kunderMap.put(kunde.getNavn(), kunde);
        return  true;

    }


}
