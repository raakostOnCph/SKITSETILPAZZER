import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        Odre odre = new Odre();
//
//        System.out.println(odre.indsætPazza(new Pazza("hawaii", 35)));
//        System.out.println(odre.indsætPazza(new Pazza("hawaii", 35)));
//        System.out.println(odre.indsætPazza(new Pazza("hawaii", 35)));
//        System.out.println(odre.indsætPazza(new Pazza("hawaii", 35)));
//        System.out.println(odre.indsætPazza(new Pazza("hawaii", 35)));
//
//        System.out.println(odre.fjernPizza("hawaii"));
//        System.out.println(odre.getTotal());


        Kunde kunde = new Kunde("patrick");


//        kunde.getOdre().indsætPazza(1);
//        kunde.getOdre().indsætPazza(1);
//        System.out.println(kunde.getOdre().getTotal());
//        kunde.getOdre().fjernPizza(1);
//        System.out.println(kunde.getOdre().getTotal());

        KundeListe kundeListe = new KundeListe();

        String navn = "";


        while (true) {

            switch (getString("hvad ønsker")) {


                case "nk":
                    navn = getString("angiv navn");
                    System.out.println(kundeListe.indsætKunde(new Kunde(navn)));

                    break;
                case "bestil":
                    if (kundeListe.kunderMap.containsKey(navn)) {
                        kundeListe.kunderMap.get(navn).getOdre().indsætPazza(getInt("pizza nr"));
                    } else {
                        System.out.println("kunden findes ikke i kundelisten");
                    }
                    break;
                case "se":
                    System.out.println(kundeListe.kunderMap.get(navn).getOdre().getPazzaArrayList().toString());
                    break;
                case "fjern":

                    if (kundeListe.kunderMap.containsKey(navn)) {
                        kundeListe.kunderMap.get(navn).getOdre().fjernPizza(getInt("pizza nr"));
                    } else {
                        System.out.println("kunden findes ikke i kundelisten");
                    }
                    break;


                default:
                    System.out.println("det forstod jeg ikke, prøv igen");
            }


        }


    }


    public static String getString(String s)
    {

        System.out.print(s + " : ");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }

    public static Integer getInt(String s)
    {

        while (true) {
            try {
                Integer i = Integer.parseInt(getString(s));
                return i;
            } catch (NumberFormatException e) {
                System.out.println("ikke et tal ord");
            }
        }


    }

}