public class StoreRunner {
  public static void main(String[] args) {
    
  //Parameterized constructors
    clothes c = new clothes("Jacket", 59.21, "L");
    tshirt t = new tshirt("shirt", 19.94, "S", true);
    jeans j = new jeans("Jeans", 49.62, "M", "Straight");

   System.out.println(c);
   System.out.println(t);
   System.out.println(j);

   t.setPrice(14.00);
   j.setType("Baggy");

   System.out.println(t.getPrice());
   System.out.println(j.getType());

  //No argument constructors  
    clothes defaultClothes = new clothes();
    tshirt defaultShirt = new tshirt();
    jeans defaultJeans = new jeans();


  //Overloaded parameterized constructors
    clothes sweater = new clothes("Sweater", 29.99);
    tshirt graphicShirt = new tshirt("Graphic shirt", 24.84, true);
    jeans baggyJeans = new jeans("Stylish jeans", 54.41, "Baggy");

    
    System.out.println(defaultClothes);
    System.out.println(defaultShirt);
    System.out.println(defaultJeans);
    System.out.println(sweater);
    System.out.println(graphicShirt);
    System.out.println(baggyJeans);
  
   
  }
}