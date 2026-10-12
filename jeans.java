public class jeans extends clothes {
  
  private String type;

  // Creates default jeans
  public jeans() {
    super();
    type = "Straight";
  }

  /*
   * Creates jeans 
   * Assigned value
   */
  public jeans(String name, double price, String size, String type) {
    super(name, price, size);
    this.type = type;
  }

  /*
   * Creates jeans 
   * Default size
   */
  public jeans(String name, double price, String type) {
    super(name, price);
    this.type = type;
  }

  // Returns the jeans type
  public String getType() {
    return type;
  }

  // Changes the jeans type
  public void setType(String type) {
    this.type = type;
  }

  // Returns jeans information
  public String toString() {
    return super.toString() + ", Type: " + type;
  }
}