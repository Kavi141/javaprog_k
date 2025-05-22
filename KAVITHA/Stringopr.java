import java.util.Scanner;
public class Stringopr{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter a string:");
String s=obj.next();
StringBuffer sb=new StringBuffer(s);
String rev=sb.reverse().toString();
System.out.println("Reversed string:"+rev);
if(s.equalsIgnoreCase(rev))
{
System.out.println("The string is a palindrome");
}
else{
System.out.println("The string is not a palindrome");
}
System.out.println("Uppercase:"+s.toUpperCase());
System.out.println("Lowercase:"+s.toLowerCase());
System.out.println("Enter a sub string :");
String sub=obj.next();
if(s.contains(sub))
{
System.out.println("SubString found at index:"+s.indexOf(sub));
}
else{
System.out.println("Substring not found");
}
obj.close();
}
}

