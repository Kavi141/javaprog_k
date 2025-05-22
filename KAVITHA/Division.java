import java.util.Scanner;
import java.util.*;
public class Division{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
boolean ch=true;
while(ch)
{
try{
System.out.println("Enter number 1:");
int a=obj.nextInt();
System.out.println("Enter number 2:");
int b=obj.nextInt();
int rs=a/b;
System.out.println("Result:"+rs);
}
catch(InputMismatchException e)
{
System.out.println("Invalid input!please enter numeric values");
obj.next();
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("Do you want to try again(yes/no):");
String res=obj.next();
if(res.equalsIgnoreCase("no"))
{
ch=false;
System.out.println("Exit");
break;
}
}
obj.close();
}
}
