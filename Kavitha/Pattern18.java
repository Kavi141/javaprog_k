public class Pattern18{
public static void main(String[] args){
int i=0,j=0;
for( i=4;i>=1;i--){
for( j=1;j<=4-i;j++){
System.out.print(" ");
}
for(int k=4-i+1;k<=i;k++){
System.out.print(k+" ");}
System.out.println();
}
}}