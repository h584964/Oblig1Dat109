package no.hvl.dat109.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Johan og Jørgen
 * 
 */ 
public class Brett {
  	  //Brettet eier terningen
      private Map<Integer, Integer> brett;

      public Brett(int antallRuter) {
         brett = new HashMap<Integer, Integer>();
  
         setup();
      }
  
     
  
    //Iterasjon 2: Stiger og slanger
      private void setup() {
          brett.put(5,13);
          brett.put(14,2);
          brett.put(58,32);
          brett.put(70,90);
          brett.put(15,8);
          brett.put(99,1);
      }  
      public int spesRuteverdi(int rutnr) {

        Integer nyrute = brett.get(rutnr);
        if (nyrute == null)
          return rutnr;

        System.out.println("Brikken landet på en stige/slange, og flyttes til: " + nyrute);
        return nyrute;
         
      }
}
