package Instruments;

public class Guitar extends _Instrument {

  private int noStrings;

  public Guitar(int noStrings, String material, String colour, Section section, double buyingPrice, double sellingPrice){
    super(material, colour, section, "Guitar", buyingPrice, sellingPrice);
    this.noStrings = noStrings;
  }

  public String play() { return "Twang"; }

  public int getNoStrings() { return noStrings; }

}
