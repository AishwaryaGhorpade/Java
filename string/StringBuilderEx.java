package string;
import java.util.*;
public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //length()
        System.out.println(sb.length());  //4

        //charAt
        System.out.println(sb.charAt(2)); //n

        //setCharAt
        sb.setCharAt(0, 'p'); 
        System.out.println(sb);   //pony
        
        //insert
        sb.insert(2, 'n');
        System.out.println(sb);   //ponny

        //delete
        sb.delete(2, 5);
        System.out.println(sb);   //po

        //append
        sb.append('n');
        sb.append('y');
        System.out.println(sb);  //pony

        //reverse
        System.out.println(sb.reverse());  //ynop

        StringBuilder str=new StringBuilder("hello");
        // StringBuilder reverse=new StringBuilder();
        String reverse="";
        char ch;

        for(int i=str.length()-1;i>=0;i--)
        {
            ch=str.charAt(i);
            reverse+=ch;
        }
        System.out.println(reverse);  //olleh

    }
    
}
