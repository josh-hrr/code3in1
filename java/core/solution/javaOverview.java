import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class MyClass {
    public static void main(String args[]) {  
        
        /*
        
        .trim()
        .charAt(index)
        .contains("string")
        .equals("string")
        .equalsIgnoreCase("string")
        .replace("actual", "expected")
        .substring(2, 5)                      welcome              lco
        .split(" ")
        
        */
        
        String data = "madam";
        
        String[] dataArr = data.split("");
        
        List<String> dataArrList = new ArrayList<>();
        
        String outcome = "";
        for(int i = dataArr.length - 1; i >= 0; i--){
            outcome = outcome + String.join("", dataArr[i]); 
        }
        
        //reversed data
        System.out.println(data);
        System.out.println(outcome);
        
        //asking if palindrome
        if(data.equals(outcome)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
