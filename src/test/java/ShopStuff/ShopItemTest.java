package ShopStuff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopItemTest {

  private ShopItem shopItem;

  @Before
  public void before(){ shopItem = new ShopItem("Strings", .8, 1.2); }

  @Test
  public void hasName(){ assertEquals("Strings", shopItem.getName()); }

  @Test
  public void hasBuyingPrice(){ assertEquals(.8, shopItem.getBuyingPrice(), 0.01); }

  @Test
  public void hasSellingPrice(){ assertEquals(1.2, shopItem.getSellingPrice(), 0.01); }

  @Test
  public void canCalculateMarkUp(){ assertEquals(.4, shopItem.calculateMarkUp(), 0.01); }

}
