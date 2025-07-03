import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;


class TestClass_3 {
    public static void main(String args[] ) throws Exception {
       Scanner ob = new Scanner(System.in);
       String s = ob.next();
       if(s.length() > 20){
        System.out.println("No");
        return;
       }
        if(s.matches("(?i)Z+O+") ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
