 
import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
         
        int[] array = {1, 100, 3, 50, 15};
        
        int min = Arrays.stream(array).min().orElseThrow();
        int max = Arrays.stream(array).max().orElseThrow();
        
        System.out.println(min);
        System.out.println(max);
         
    }
}
