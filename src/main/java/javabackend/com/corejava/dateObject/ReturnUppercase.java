package corejava.dateObject;
import java.util.Optional;
public class ReturnUppercase {

    public static void returnUpperStr(Optional<String> opt){

        String res;

        if(opt.isEmpty()){
            System.out.println("Empty Optional");
        }
        else
        {
            res = opt.get().toUpperCase();
            System.out.println(res);
        }


    }
    public static void main(String[] args) {

        String value = "Hai";
        String val = null;
        Optional<String> optionalVal = Optional.ofNullable(val);
        Optional<String> optVal = Optional.ofNullable(value);
        returnUpperStr(optionalVal);
        returnUpperStr(optVal);


    }

}
