public class Product {
   public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(double quantity){
        return price*quantity;
    }
}
