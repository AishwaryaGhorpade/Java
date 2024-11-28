package RegEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        //Logical operators
        //XY  ---->	X followed by Y
      Pattern pat=Pattern.compile("ab");
      Matcher mat=pat.matcher("ab");
      boolean matches=mat.matches();
      System.out.println("result:" + matches); 

      //X|Y	--->  Either X or Y  
      Pattern pat1=Pattern.compile("a|b");
      Matcher mat1=pat1.matcher("a");   //true
      boolean matches1=mat1.matches();
      System.out.println("result:" + matches1); 
      //a=true,y=true,xy=false
    }
    
}
