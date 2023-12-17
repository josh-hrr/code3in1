// tip: each public class is put in its own file

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        /*

        
        Integer[] numbers = {1, 100, 3, 50, 15};

        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));

        for(int i = 0; i < list.size(); i++ ) {
         }

        int max = Collections.max(list);
        int indexMax = list.indexOf(max);

        System.out.println("Max: " + max + " index: " + indexMax);

        */

        int data = 1234;

        System.out.println(String.valueOf(data).split(""));

        String[] st = String.valueOf(data).split("");

        ArrayList<String> arrList = new ArrayList<>();


        for(int i = st.length - 1; i>=0; i--){
            arrList.add(st[i]);
        } 

        System.out.println(Integer.parseInt(String.join("", arrList)));
    }
}
