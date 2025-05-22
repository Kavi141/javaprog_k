import java.util.Scanner;
class operators
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter two numbers to perform all operators:");
int num1=obj.nextInt();
int num2=obj.nextInt();
boolean a=true;
boolean b=false;
System.out.println("Arithmetic operations.....");
System.out.println("Addition="+(num1+num2));
System.out.println("Subtaction="+(num1-num2));
System.out.println("Multiplication="+(num1*num2));
System.out.println("Division="+(num1/num2));
System.out.println("Modulus="+(num1%num2));
System.out.println("Relational operators.....");
System.out.println("num1 == num2 = " + (num1 == num2) );
System.out.println("num1 != num2 = " + (num1 != num2) );
System.out.println("num1 >  num2 = " + (num1 >  num2) );
System.out.println("num1 <  num2 = " + (num1 <  num2) );
System.out.println("num1 >= num2 = " + (num1 >= num2) );
System.out.println("num1 <= num2 = " + (num1 <= num2) );
System.out.println("Logical operators.....");
System.out.println("a && b="+(a && b));
System.out.println("a || b="+(a || b));
System.out.println("! a="+(!a));
System.out.println("Bitwise operators....");
System.out.println("num1 & num2="+(num1 & num2));                                                                                                                                                                                       
System.out.println("num1 | num2="+(num1 | num2));
System.out.println("num1 ^ num2="+(num1 ^ num2));
System.out.println("Assignment operators....");
System.out.println("num1 += num2:"+(num1+=num2));
System.out.println("num2 -= num1:"+(num2 -= num1));
System.out.println("Unary operators....");
System.out.println("num1++ ="+(num1++));
System.out.println("num1-- ="+(num1--));
System.out.println("++num2 ="+(++num2));
System.out.println("--num2 ="+(--num2));
obj.close (); 
}
}
