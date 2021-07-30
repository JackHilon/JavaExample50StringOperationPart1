
package javaexample50stringoperationpart1;

import java.util.Arrays;


public class JavaExample50StringOperationPart1 {

    
    public static void main(String[] args) {
        
        
        String s1;
        s1=new String("Hi there!!!!");
        
        String s2;
        s2="My name is....";
        
        String s3;
        s3="welcome";
        
        String s4;
        s4=null;
        
        String s5=null;
        
        System.out.println("The first string is: "+s1);
        System.out.println("The second string is: "+s2);
        System.out.println("The third string is: "+s3);
        System.out.println("The fourth string is: "+s4);
        System.out.println("The fifth string is: "+s5);
        System.out.println();
        
        s2 = s1;
        System.out.println("s1 is: "+s1);
        System.out.println("s2 is: "+s2);
        System.out.println();
        System.out.println("s1 length is: "+s1.length());
        System.out.println("The character at index (5) is: "+s1.charAt(5));
        
        try{
        System.out.println("The character at index (30) is: "+s1.charAt(30));
        }catch(Exception e)
        {
            System.out.println("The character at index (30) is: "+e.toString());
        }
        
        
        System.out.println();
        
        try{
        System.out.println("s4 (null-string) is: "+s4);
        System.out.println("s4 length is: "+s4.length());
        }catch(Exception e)
        {
        System.out.println("s4 length is: "+e.toString());            
        }
        
        System.out.println(); 
        
        char[] a=new char[] {'a', 'f', 'l', 'p','p'};
        System.out.println("Char-array (a) is: "+Arrays.toString(a));
        String s6 =new String(a);
        System.out.println("s6 is: "+s6);
        String s7=new String(a, 2, 2);
        System.out.println("s7 is: "+s7);
        
        System.out.println();
        char[] b ={ 'a', 'b', 'c','d','e','f','g','h','i'};
        String s8=CharArray2String(b, 3, 5);
        System.out.println("s8 is: "+s8);
        
        
    }
    
    // only fot illustration
    private static String CharArray2String(char[] charArray, int offset, int count)
    {
        try{
            String str=new String(charArray, offset, count);
            return str;
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            return e.toString();
        }
    }
}
