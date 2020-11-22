package Instruments;

public class Piano extends _Instrument {

  private int noKeys;

  public Piano(int noKeys, String material, String colour, Section section, double buyingPrice, double sellingPrice){
    super(material, colour, section, "Piano", buyingPrice, sellingPrice);
    this.noKeys = noKeys;
  }

  public String play() { return "Plunk"; }

  public int getNoKeys() { return noKeys; }

}
