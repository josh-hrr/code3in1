import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) { 
      int[] a = {50,20,30,100,10};    
      Arrays.sort(a);
      for(int i = 0; i<a.length; i++){ 
          System.out.println(a[i]);
      }   
    }
}
