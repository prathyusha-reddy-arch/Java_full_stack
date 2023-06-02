import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Department class
        subDepartmentclass sd = new subDepartmentclass();
        int x = sd.getDepartmentSize();
        System.out.println(x);

        //Product class
        Product product = new Product();
        //getting price
        double price = product.getPrice();
        System.out.println("Initial price : " + price);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price to set: ");
        double p = sc.nextDouble();
        //setting price
        product.setPrice(p);
        System.out.println("New price" + product.getPrice());

        System.out.println("Enter quantity :");
        double quantity = sc.nextDouble();
        //changing price according to quantity
        double pd = product.getPrice(quantity);
        System.out.println("Price based on quantity " + pd);


        //implementing method overriding
        poly2 pol = new poly2();
        pol.poly();

    }
}
