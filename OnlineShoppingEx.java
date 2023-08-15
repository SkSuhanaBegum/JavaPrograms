/*Online Shopping System: In an online shopping system, there may be a superclass called Product with a method called calculateDiscount() that calculates the discount on the product's price. Different types of products, such as Electronics and Apparel, may be subclasses of Product and override the calculateDiscount() method to calculate the discount based on their specific sales and promotions. For example, an Electronics product may offer a discount based on the purchase amount or bundle deals, while an Apparel product may offer a discount based on the seasonal trends or inventory clearance*/
class Product
  {
    String product;
    double price;
    int quantity;
    int discount=10;
    double finalprice=0;
    void calculateDiscount()
    {
      System.out.println("calculate the discount");
      if(price<3000 && price>=1000 && quantity>=1)
      {
      finalprice=price-price*discount/100;
      System.out.println(finalprice);
      }
      if(price<5000 && price>=3000 && quantity>=1)
      {
      finalprice=price-price*discount/100;
      System.out.println(finalprice);
      }
      if(price<7000 && price>=5000 && quantity>=1)
      {
      finalprice=price-price*discount/100;
      System.out.println(finalprice);
      }
      if(price<10000 && price>=7000 && quantity>=1)
      {
      finalprice=price-price*discount/100;
      System.out.println(finalprice);
      }
    }
    
  }
