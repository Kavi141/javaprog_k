public class Pattern17{
public static void main(String[] args){
int i=0,j=0;
for( i=1;i<=5;i++){
for( j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print("* ");}
System.out.println();
}
}}