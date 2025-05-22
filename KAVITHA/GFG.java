class binarystr
{
void conversion(String a,String b)
{
int n1=Integer.parseInt(a,2);
int n2=Integer.parseInt(b,2);
int sum=n1+n2;
String result=Integer.toBinaryString(sum);
System.out.println("After addition:"+result);
}
public static void main(String args[])
{
string a="1001";
string b="1100";
conversion(a,b);
}
}
