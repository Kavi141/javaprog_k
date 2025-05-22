import java.util.Scanner;
class swap
{
public static void main(String args[])
{
int a,b;
Scanner obj=new Scanner(System.in);
System.out.println("enter two numbers:");
a=obj.nextInt();
b=obj.nextInt();
System.out.println("Before swap\na="+a+"\nb="+b);
a=a-b;
b=a+b;
a=b-a;
System.out.println("After swap\na="+a+"\nb="+b);
obj.close();
}
}
