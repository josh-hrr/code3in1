import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        
      Map<Character, Integer> occurrencesMap = new HashMap<>(); 
      for(char current : str.toCharArray()){
        occurrencesMap.put(current, occurrencesMap.getOrDefault(current, 0) + 1);
      } 
      return occurrencesMap; 
    }
}
