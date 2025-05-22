import java.util.*;
import java.util.Scanner;
public class arraylist{
public static void main(String args[])
{
ArrayList<String>list=new ArrayList<>();
list.add("kavi");
list.add("nive");
list.add("nadia");
list.add("vani");
list.add("kiran");
for(String item:list){
System.out.println(item);
}
list.remove("kavi");
list.remove("nive");
list.remove("nadia");
list.remove("vani");
list.remove("kiran");
if(list.isEmpty())
{
System.out.println("List is empty");
}
else{
System.out.println(list);
}
}}
