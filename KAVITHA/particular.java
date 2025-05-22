import java.util.Scanner;
class particular
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
for(int k=1;k<=i;k++)
{
System.out.print(k+" ");
}
for(int l=i-1;l>=1;l--)
{
System.out.print(l+" ");
}
System.out.println();
}
}
}