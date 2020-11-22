package ShopStuff;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

  private ArrayList<ISell> stock = new ArrayList<ISell>();

  public ArrayList<ISell> getStock() { return stock; }

  public void addStock(ISell item){ stock.add(item); }

  public void removeStock(ISell item){ stock.remove(item); }

}
