package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

  private Piano piano;

  @Before
  public void before(){
    piano = new Piano(88, "Wood", "Brown", Section.String, 25.0, 45.0);
  }

  @Test
  public void hasKeys(){ assertEquals(88, piano.getNoKeys()); }

}
