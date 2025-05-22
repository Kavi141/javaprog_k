import java.util.Scanner;
class datatype
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter a integer value:");
int a=obj.nextInt();
System.out.println("Enter a float value:");
float b=obj.nextFloat();
System.out.println("Enter a Short value:");
short c=obj.nextShort();
System.out.println("Enter a long value:");
long d=obj.nextLong();
System.out.println("Enter a double value:");
double e=obj.nextDouble();
System.out.println("Enter a boolean value:");
boolean f=obj.nextBoolean();
System.out.println("Enter a char value:");
char g=obj.next().charAt(0);
System.out.println("Enter a byte value:");
byte h=obj.nextByte();
System.out.println("Printing values.......");


System.out.println("Integer value="+a);
System.out.println("Float value="+b);
System.out.println("Short value="+c);
System.out.println("Long value="+d);
System.out.println("Double value="+e);
System.out.println("Boolean value="+f);
System.out.println("Character value="+g);
System.out.println("Byte value="+h);
obj.close();
}
}

