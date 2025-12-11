public class Pattern15{
public static void main(String[] args){
int i=0,j=0;
for( i=5;i>=1;i--){
for( j=1;j<=5-i;j++){
System.out.print("  ");
}
for(int k=1;k<=i;k++){
System.out.print("* ");}
System.out.println();
}
}}