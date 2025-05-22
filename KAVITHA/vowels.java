import java.util.*;
class vowels
{
public static void main(String args[]){
String s="ntr";
if(s.toLowerCase().matches(".*[aeiou].*"))
{
System.out.println("yes");
}
else{
System.out.println("no");
}
}
}