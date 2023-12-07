import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class MyClass {
    public static void main(String args[]) {  
        Integer[] numbers = {1, 100, 3, 50, 15};
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers)); 
        int firstMin = Collections.min(list);
        int indexToRemove = list.indexOf(firstMin);
        list.remove(indexToRemove);  
        
        System.out.println(firstMin); 
    }
}
