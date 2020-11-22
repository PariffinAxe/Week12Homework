package Instruments;

import Behaviours.IPlay;
import ShopStuff.ShopItem;

public abstract class _Instrument extends ShopItem implements IPlay  {

  private final String material;
  private final String colour;
  private final Section section;

  public _Instrument(String material, String colour, Section section, String name, double buyingPrice, double sellingPrice) {
    super(name, buyingPrice, sellingPrice);
    this.material = material;
    this.colour = colour;
    this.section = section;
  }

  public String getMaterial() { return material; }

  public String getColour() { return colour; }

  public Section getSection() { return section; }

}
