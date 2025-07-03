import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass2 {
    public static void main(String args[] ) throws Exception {
       Scanner obj=new Scanner(System.in);
	System.out.println("Enter range:");
       int n=obj.nextInt();
       int[] arr1 = new int[n];
       int[] arr2 = new int[n];
	System.out.println("Enter array1:");
       for(int i=0;i<n;i++){
        arr1[i] = obj.nextInt();
       }
	System.out.println("Enter array2:");
       for(int i=0;i<n;i++){
        arr2[i] = obj.nextInt();
       }
       long target = arr1[0];
       for(int i=0;i<n;i++){
        if(arr1[i]<target){
            target = arr1[i];
        }
        }
        long count=0;
        for(int i=0;i<n;i++){
        long diff = arr1[i]-target;
        if(diff == 0)
        {
        continue;
        }
        if(arr2[i]==0||diff%arr2[i]!=0){
            System.out.println("-1");
            return;
        }
        count+=diff/arr2[i];
       }
       System.out.println(count);
       }
}
