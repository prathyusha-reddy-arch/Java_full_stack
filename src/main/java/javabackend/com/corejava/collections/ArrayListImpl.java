package corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class ArrayListImpl {
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<5;i++){
            al.add(sc.next());
        }
        System.out.println("Printing using for loop");
        for(int i=0;i< al.size();i++){
            System.out.println(al.get(i));
        }

        System.out.println("Printing using enhanced for loop");
        for(String str:al){
            System.out.println(str);
        }

        System.out.println("Printing using iterator");
        Iterator<String> it= al.iterator();
        while(it.hasNext())
        System.out.println(it.next());

        System.out.println("Printing using streams");
        Stream.of(al).forEach(s -> System.out.print(s+" "));
        Stream.of(al).parallel().forEach(System.out::println);
    }
}
