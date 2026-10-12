public class tshirt extends clothes {
  
  private boolean hasPrint;

  // Creates a default tshirt
  public tshirt() {
    super();
    hasPrint = false;
  }

  /*
   * Creates a tshirt 
   * Assigned values
   */
  public tshirt(String name, double price, String size, boolean hasPrint) {
    super(name, price, size);
    this.hasPrint = hasPrint;
  }

  /*
   * Creates a tshirt 
   * Default size
   */
  public tshirt(String name, double price, boolean hasPrint) {
    super(name, price);
    this.hasPrint = hasPrint;
  }

  // Returns whether the tshirt has a print
  public boolean getHasPrint() {
    return hasPrint;
  }

  // Changes whether the tshirt has a print
  public void setHasPrint(boolean hasPrint) {
    this.hasPrint = hasPrint;
  }

  // Returns tshirt information
  public String toString() {
    return super.toString() + ", Has Print: " + hasPrint;
  }
}