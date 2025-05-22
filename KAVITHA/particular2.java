import java.util.Scanner;
class particular2
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.println("enter a value:");
int n=ob.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<n;j++)
{
System.out.print("  ");
}
for(int k=1;k<=2*i-1;k++)
{
System.out.print("* ");
}
System.out.println();
}
}
}