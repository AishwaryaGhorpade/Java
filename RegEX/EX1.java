//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/regex/Pattern.html

//Quantifiers
package RegEX;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EX1 {
   public static void main(String[] args) {
      Pattern pat=Pattern.compile("aa");
      Matcher mat=pat.matcher("aa");
      boolean matches=mat.matches();
      System.out.println("result:" + matches);  


      //n+  --->  Matches any string that contains at least one n
    Pattern pat1=Pattern.compile("a+");
    Matcher mat1=pat1.matcher("aaaa");
    boolean matches1=mat1.matches();
    System.out.println("result:" + matches1);

    //n*  --->  Matches any string that contains zero or more occurrences of n
    Pattern pat2=Pattern.compile("a*");
    Matcher mat2=pat2.matcher("");
    boolean matches2=mat2.matches();
    System.out.println("result:" + matches2);

    //n?  --->  Matches any string that contains zero or more occurrences of n
    Pattern pat3=Pattern.compile("a*");
    Matcher mat3=pat3.matcher("a");
    boolean matches3=mat3.matches();
    System.out.println("result:" + matches3);

//n{x}  ---> Matches any string that contains a sequence of X n's
Pattern pat4=Pattern.compile("a{6}");
Matcher mat4=pat4.matcher("aaaaaa");
boolean matches4=mat4.matches();
System.out.println("result:" + matches4);

//n{x,y}  ---> Matches any string that contains a sequence of X to Y n's
Pattern pat5=Pattern.compile("a{3,5}");   //btw 3-5
Matcher mat5=pat5.matcher("aaaaaaaaa");
boolean matches5=mat5.matches();
System.out.println("result:" + matches5);

//n{x,}  --->Matches any string that contains a sequence of at least X n's
Pattern pat6=Pattern.compile("a{3,}");   //btw 3-5
Matcher mat6=pat6.matcher("aaa");
boolean matches6=mat6.matches();
System.out.println("result:" + matches6);


// Reluctant quantifiers
// X??	X, once or not at all
// X*?	X, zero or more times
// X+?	X, one or more times
// X{n}?	X, exactly n times
// X{n,}?	X, at least n times
// X{n,m}?	X, at least n but not more than m times


// Possessive quantifiers
// X?+	X, once or not at all
// X*+	X, zero or more times
// X++	X, one or more times
// X{n}+	X, exactly n times
// X{n,}+	X, at least n times
// X{n,m}+	X, at least n but not more than m times


   }   
}
