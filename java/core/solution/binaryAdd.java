public class Kata{
  
  public static String binaryAddition(int a, int b){
    
    int decimalSum = (a + b); 
    String binary = Integer.toBinaryString(decimalSum);
    return binary;
  }
}
