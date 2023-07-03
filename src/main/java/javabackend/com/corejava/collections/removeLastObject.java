package corejava.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class removeLastObject {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            al.add(sc.next());
        }
        al.remove(al.size()-1);

        for(String str:al){
            System.out.println(str);
        }


    }
}

