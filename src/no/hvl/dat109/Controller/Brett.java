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

      /**
       * 
       * @param antallRuter på brettet i stigespillet.
       */
      public Brett(int antallRuter) {
         brett = new HashMap<Integer, Integer>();
  
         setup();
      }
  
     
    /**
     * Hvor stiger og slanger er.
     */
    
      private void setup() {
          brett.put(5,13);
          brett.put(14,2);
          brett.put(58,32);
          brett.put(70,90);
          brett.put(15,8);
          brett.put(99,1);

         
      } 

      
      
      /**
       * 
       * @param rutnr
       * @return hvilken rutenr brikken er på. 
       */
      public int spesRuteverdi(int rutnr) {

        Integer nyrute = brett.get(rutnr);
        if (nyrute == null)
          return rutnr;

        return nyrute;
         
      }
}
