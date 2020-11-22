package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

  private Guitar guitar;

  @Before
  public void before(){ guitar = new Guitar(6, "Wood", "Brown", Section.String, 25.0, 45.0); }

  @Test
  public void hasStrings(){ assertEquals(6, guitar.getNoStrings()); }

}
