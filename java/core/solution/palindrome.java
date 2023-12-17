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
        int data = 44322; 
        String[] st = String.valueOf(data).split("");
        ArrayList<String> arrList = new ArrayList<>();
        for(int i = st.length - 1; i>=0; i--){
            arrList.add(st[i]);
        } 
        int reversedNumber = Integer.parseInt(String.join("", arrList));
        if(data == reversedNumber){
            System.out.println("palindrome");
        } 
    }
}
