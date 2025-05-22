import java.util.Scanner;
interface Shape{
double calcArea();
double calcPerim();
}
class circle implements Shape{
double r;
public circle(double r)
{
this.r=r;
}
public double calcArea()
{
return Math.PI*r*r;
}
public double calcPerim()
{
return 2*Math.PI*r;
}
}
class rectangle implements Shape{
double l,b;
public rectangle(double l,double b)
{
this.l=l;
this.b=b;
}
public double calcArea()
{
return l*b;
}
public double calcPerim()
{
return 2*(l+b);
}
}
public class calcshape{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter a choice:(1 :Circle/2 :Rectangle):");
int ch=obj.nextInt();
Shape sh=null;
switch(ch)
{
case 1:{
System.out.println("Enter the radius of the circle:");
double r=obj.nextDouble();
sh=new circle(r);
break;
}
case 2:
{
System.out.println("Enter length and breadth of rectangle:");
double l=obj.nextDouble();
double b=obj.nextDouble();
sh=new rectangle(l,b);
break;
}
default:
{
System.out.println("invalid choice");
break;
}
}
double area=sh.calcArea();
double perimeter=sh.calcPerim();
System.out.println("Area :"+area);
System.out.println("Perimeter:"+perimeter);
obj.close();
}
}







