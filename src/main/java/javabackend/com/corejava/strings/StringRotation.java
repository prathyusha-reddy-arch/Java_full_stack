package corejava.strings;

public class StringRotation {
          public boolean isRotation(String str1,String str2){
              String newString=str1+str1;
              if(newString.contains(str2))
                  return true;
              return false;
          }
}
