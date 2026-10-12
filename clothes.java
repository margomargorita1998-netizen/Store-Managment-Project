public class clothes {
  private String name;
  private double price;
  private String size;

  
  /*
   * Creates an item  
   * Default values
   */
  public clothes() {
    name = "Unknown";
    price = 0.0;
    size = "M";
  }

  
  /*
   * Creates an item  
   * Assigned values
   */
  public clothes(String name, double price, String size) {
    this.name = name;
    this.price = price;
    this.size = size;
  }

  
  /*
   * Creates an item 
   * Default size
   */
  public clothes(String name, double price) {
    this(name, price, "M");
  }

  
  // Returns the name
  public String getName() {
    return name;
  }

  // Returns the price
  public double getPrice() {
    return price;
  }

  // Returns the size
  public String getSize() {
    return size;
  }

  // Changes the name
  public void setName(String name) {
    this.name = name;
  }

  // Changes the price
  public void setPrice(double price) {
    this.price = price;
  }

  // Changes the size
  public void setSize(String size) {
    this.size = size;
  }

  // Returns information
  public String toString() {
    return name + ", $" + price + ", Size: " + size;
  }
}