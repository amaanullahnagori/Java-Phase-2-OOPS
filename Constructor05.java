

public class Constructor05 {
    public static void main(String[] args) {
        Product glass =new Product("glass","hj-121",200, 4);
        System.out.println("the item name is :"+glass.getItemName());
        System.out.println("the itemcode is : "+glass.getItemNos());
        System.out.println("the item price/piece is : "+glass.getPrice());
        System.out.println("the item quantity is : "+glass.getQty());
        glass.setPrice(250);
        System.out.println("shopkeeper counter the price to : "+glass.getPrice()+" for "+glass.getQty()+" pieces");
        glass.setQty(6);
        System.out.println("if quanty is : "+glass.getQty());
        glass.setPrice(200);
        System.out.println("the price can be reduce to : "+ glass.getPrice());


}
}
class Product {
    private int   qty;
    private double price;
   private String itemName,item_nos;
   public Product(String n,String code, int  price,int  q)
   {
       this.qty=q;
       this.price=price;
       this.itemName=n;
       this.item_nos=code;
   }
    public double getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }
    public String getItemNos() {
        return item_nos;
    }

    public void setQty(int  qty) {
        this.qty = qty;

    }

    public int getQty() {
        return qty;
    }
    public double setPrice (double p)
    {
        price=p;
        return price ;
    }
}

