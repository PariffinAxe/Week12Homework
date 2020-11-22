package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

  private Piano piano;

  @Before
  public void before(){
    piano = new Piano(88, "Wood", "Brown", Section.String, 25.0, 45.0);
  }

  @Test
  public void hasMaterial(){ assertEquals("Wood", piano.getMaterial()); }

  @Test
  public void hasColour(){ assertEquals("Brown", piano.getColour()); }

  @Test
  public void hasSection(){ assertEquals(Section.String, piano.getSection()); }

  @Test
  public void canPlay(){ assertEquals("Plunk", piano.play());}
}
