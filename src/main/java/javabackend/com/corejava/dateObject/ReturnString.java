package corejava.dateObject;

import java.util.Optional;

public class ReturnString {

    public static void  returnString(String str) {

        Optional<String> optVal = Optional.ofNullable(str);

        if(optVal.isPresent()){
            int x = str.length();
            System.out.println("The String length is:" +str.length());
        }
        else
            System.out.println("Empty String");

    }

    public static void main(String[] args) {



        String value ="hai";
        String val = null;

        ReturnString.returnString(value);
        ReturnString.returnString(val);






    }

}
