package ShopStuff;

import Instruments.Piano;
import Instruments.Section;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

  private Shop shop;
  private Piano piano;
  private ShopItem shopItem;

  @Before
  public void before(){
    shop = new Shop();
    piano = new Piano(88, "Wood", "Brown", Section.String, 25.0, 45.0);
    shopItem = new ShopItem("Strings", .8, 1.2);
  }

  @Test
  public void hasStock(){ assertEquals(0, shop.getStock().size()); }

  @Test
  public void canAddStock(){
    shop.addStock(piano);
    shop.addStock(shopItem);
    assertEquals(2, shop.getStock().size());
  }

  @Test
  public void canRemoveStock(){
    shop.addStock(piano);
    shop.addStock(shopItem);
    shop.removeStock(shopItem);
    assertEquals(1, shop.getStock().size());
  }


}
