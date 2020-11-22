package ShopStuff;

import Behaviours.ISell;

public class ShopItem implements ISell {

  private String name;
  private double buyingPrice;
  private double sellingPrice;

  public ShopItem(String name, double buyingPrice, double sellingPrice) {
    this.name = name;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  }

  public String getName() { return name; }

  public double getBuyingPrice() { return buyingPrice; }

  public double getSellingPrice() { return sellingPrice; }

  public double calculateMarkUp() { return sellingPrice - buyingPrice; }

}
