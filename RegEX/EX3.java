package RegEX;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EX3 {
    public static void RegExpattern(String re,String pat)
    {
        Pattern pattern=Pattern.compile(re);
        Matcher matcher=pattern.matcher(pat);
        Boolean res=matcher.matches();
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter regular Expression:");
            String re=sc.nextLine();
            System.out.println("Enter your pattern:");
            String pat=sc.nextLine();
            RegExpattern(re,pat);
            System.out.println("Want to exit :(Y/N)");
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("Y"))
            {
                System.out.println("Thank you");
                break;
            }
        }
    }
    
}

//output
/*
enter regular Expression:
[a-zA-Z]
Enter your pattern:
v
true
Want to exit :(Y/N)
n
enter regular Expression:
[a-zA-Z]
Enter your pattern:
A
true
Want to exit :(Y/N)
n
enter regular Expression:
[a-d]
Enter your pattern:
c
true
Want to exit :(Y/N)
n 
enter regular Expression:
[a-d]
Enter your pattern:
e
false
Want to exit :(Y/N)
[a-zA-Z]
enter regular Expression:
[a-zA-Z]+
Enter your pattern:
AishwaryAAA
true
Want to exit :(Y/N)
n
enter regular Expression:
[a-zA-Z]
Enter your pattern:
aA
false
Want to exit :(Y/N)
n 
enter regular Expression:
[a-zA-Z]+   
Enter your pattern:
ais8
false
Want to exit :(Y/N)
n
enter regular Expression:
[a-zA-Z0-9]+
Enter your pattern:
Aish666
true
Want to exit :(Y/N)
n
enter regular Expression:
[a-zA-Z0-9]+
Enter your pattern:
Aish@123
false
Want to exit :(Y/N)
n
enter regular Expression:
[a-zA-Z0-9@]+ 
Enter your pattern:
Aish@123
true
Want to exit :(Y/N)
n
enter regular Expression:
[a-zA-Z0-9#]+ 
Enter your pattern:
Aish#123 
true
Want to exit :(Y/N)
n
enter regular Expression:
[0-9]{10}
Enter your pattern:
1234567890
true
Want to exit :(Y/N)
n
enter regular Expression:
[0-9]{10}  
Enter your pattern:
12345     
false
Want to exit :(Y/N)
n
enter regular Expression:
[0-9]{10}
Enter your pattern:
11223344556677
false */


//Email validation
/* 
enter regular Expression:
^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$ 
Enter your pattern:
aishwaryaghorpade4@gmail.com
true
*/
