/*Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.*/
//parameterized constructor
class Product
  {
    Product(String name,int price,String quality)
    {
      System.out.println("Product: " +name+ "\n" + " price: " +price + "\n" +"Quality: " + quality+"\n");
    }
    public static void main(String[]args)
    {
      Product pd=new Product("Soap",45,"Worth to Buy");
      Product pd1=new Product("pen",10,"Good");
    }
  }