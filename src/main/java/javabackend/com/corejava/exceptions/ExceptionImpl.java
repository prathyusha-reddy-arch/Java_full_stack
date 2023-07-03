package corejava.exceptions;

public class ExceptionImpl  {

    public void stringToInt(String str){
        try {
            int i = Integer.parseInt(str);

            System.out.println("Integer: " + i);
           // throw new NumberFormatException("cannot convert " + str);
        }
        catch(NumberFormatException ex){
            System.out.println("Number format exception: " +ex.getMessage());
       }
    }

    public static void main(String args[]) throws Exception {
        String str="23";
        ExceptionImpl e=new ExceptionImpl();
            e.stringToInt(str);
            e.stringToInt("45.67");
            e.stringToInt("test");
           e.stringToInt("123f");



    }
}
