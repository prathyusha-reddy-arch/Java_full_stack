import java.util.Scanner;
public class Student {
    static String name="Prathyusha";
   public static String getName()
    {
        return name;
    }
    public static void setName(String name)
    {
        name=name;

    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("getname method "+getName());
        //SETTING THE NEW NAME
        name = sc.next();
        setName(name);
        System.out.println("after setting new name setname method "+getName());


    }

}
