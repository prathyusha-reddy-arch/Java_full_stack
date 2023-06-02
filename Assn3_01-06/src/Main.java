import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	subDepartmentclass sd=new subDepartmentclass();
    int x=sd.getDepartmentSize();
    System.out.println(x);

    Product product=new Product();
    double price= product.getPrice();
    System.out.println("Initial price :"+price);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter price to set :");
    double p=sc.nextDouble();
    System.out.println("New price" + p);

    System.out.println("Enter quantity :");
    double quantity=sc.nextDouble();
    price=product.getPrice(quantity);
    System.out.println("Price based on quantity" + price);
    }
}
