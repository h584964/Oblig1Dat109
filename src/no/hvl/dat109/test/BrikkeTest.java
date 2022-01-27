package no.hvl.dat109.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import no.hvl.dat109.Controller.Brikke;

/**
 * @author Johan og Jørgen
 * 
 */ 

public class BrikkeTest {

  Brikke brikke = new Brikke("Blå");
  Brikke brikke1 = new Brikke("Grønn");

  @BeforeEach
  void setup(){
   
   /*  brikke1 = new Brikke("Grønn"); */


  }
  /**
   * Tester om metoden flytt(int verdi) funker.
   */
 
  @Test
  public void flyttTest(){
    brikke.flytt(4);
    assertEquals(5, brikke.getRutenr());

    brikke1.flytt(2);
    assertEquals(3, brikke1.getRutenr());

  }

  /**
   * Testmetode for flytt over 100.
   * Da skal metoden retunere false.
   */

  @Test
  public void flyttOver100(){

    brikke.setRutenr(98);
    brikke.flytt(4);
    assertEquals(98, brikke.getRutenr());

  }


  /**
   * Vi hadde ikke tid til å teste mer, men vi hadde testet trekk() metoden. 
   */

}
