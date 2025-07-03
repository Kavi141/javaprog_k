import java.util.*;
public class TestClass1 {
    public static void main(String args[] ) throws Exception {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        int maxRun=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                maxRun = Math.max(count,maxRun);
                count=1;
            }
        }
        maxRun=Math.max(count,maxRun);
        System.out.println(maxRun);
    }
}
