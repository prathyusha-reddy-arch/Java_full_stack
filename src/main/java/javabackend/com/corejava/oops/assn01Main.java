package corejava.oops;

import java.util.Scanner;

public class assn01Main {
    public static void main(String[] args) {
        //Assignment 2
        subDepartmentClass sd = new subDepartmentClass();
        int x = sd.getDepartmentSize();
        System.out.println("Department size: "+x+"\n");

        System.out.println("getter setter overloading");
        Scanner sc= new Scanner(System.in);
        //Product class
        Product product = new Product();
        //getting price
        double price = product.getPrice();
        System.out.println("Initial price : " + price);

        System.out.println("Enter price to set: ");
        double p = sc.nextDouble();
        //setting price
        product.setPrice(p);
        System.out.println("New price" + product.getPrice());

        System.out.println("Enter quantity :");
        double quantity = sc.nextDouble();
        //changing price according to quantity
        double pd = product.getPrice(quantity);
        System.out.println("Price based on quantity " + pd +"\n");

        //implementing method overriding
        System.out.println("Implementing polymorphism");
        poly1 pol = new poly2();
        pol.poly();
       // pol.poly2(); --cannot access poly2 which implements the overriding of the function.

    }
}
