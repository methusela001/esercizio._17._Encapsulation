package org.example;

import static java.lang.String.format;

/*use a tester class to:
 set the values by asking the user to input them
 for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
 prints the house details using the getters and String.format() */
public class home {
    public static void main(String[] args) {
        Main house = new Main();
        house.setResidentsNames(new String[]{"Andrea", "Giuseppe", "Claudio"});
        house.setFloorsNumber(6);
        house.setAddress("Via Kennedy, 3");

        /* to string con String.format dove i vari (%s che sono 3 come i valori della stringa residentsNames
        sto dicendo con quel metodo che in poche parole il mio valore "Andrea" lo posso interpretare come
         %s e subito dopo metto la virgola perchè in questo caso voglio la virgola che separa i nomi */

        System.out.println("Descrizione della casa");
        System.out.println("Indirizzo: " + house.getAddress());
        System.out.println("Numero di piani: " + house.getFloorsNumber());
        System.out.println(("Nomi degli inquilini:" + format("%s, %s, %s.", (Object) house.getResidentsNames())));
    }
}
