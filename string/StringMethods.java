package string;

public class StringMethods {
    public static void main(String[] args) {
        String fname="Aish";
        String lname="Ghorpade";
        String Full_name=fname+" "+lname;
        System.out.println(Full_name);
        //length
        System.out.println(Full_name.length());

        //charAt
        for(int i=0;i<fname.length();i++)
        {
            System.err.println(fname.charAt(i));
        }

        // for(int i=0;i<fname.length();i++)
        // {
        //     System.err.println(fname[i]); //error:The type of the expression must be an array type but it resolved to String. so use charAt method
        // }

        //compare
        String name1="Yash";
        String name2="Yash";
        
        //s1==s2:0
        //s1>s2:+ve value
        //s1<s2:-ve value
        //"cell".compareTo("Wello");    wello is greater than cello  (W>c)
        if(name1.compareTo(name2)==0)
        {
            System.out.println("name1 is equals to name2");   //op:name1 is equals to name2
        }
        else{
            System.out.println("name1 is not equals to name2");
        }

        if(name1==name2)   //== is also work but in some cases it will not work so compareTo method is recomended
        { 
            System.out.println("name1 is equals to name2");     //op:name1 is equals to name2
        }
        else{
            System.out.println("name1 is not equals to name2");
        }

        if(new String("Aish")==new String("Aish"))  
        { 
            System.out.println("name1 is equals to name2");
        }
        else{
            System.out.println("name1 is not equals to name2");    //op:name1 is not equals to name2
        }

        //substring
        String sentence="my name is Aishwarya Ghorpade";
        String name=sentence.substring(11,20);
        String Full_name1=sentence.substring(11);
        String Full_name2=sentence.substring(11,sentence.length());
        System.out.println(name);     //Aishwarya
        System.out.println(Full_name1);  //Aishwarya Ghorpade
        System.out.println(Full_name2);  //Aishwarya Ghorpade

        //Strings are immutable
        
      //ParseInt Method of Integer class
        String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);   //123

       //ToString Method of String class
       int number1 = 123;
       String str1 = Integer.toString(number1);
       System.out.println(str1.length());  //3

      //reverse fun is not there

 
    }
}
