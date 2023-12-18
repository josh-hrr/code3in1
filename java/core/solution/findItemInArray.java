public class MyClass {
    public static void main(String args[]) {
     
      int[] a = {1,2,3,4,5};  
      int itemToFind = 3;
      for(int i = 0; i<a.length; i++){ 
          if(a[i] == itemToFind){
              System.out.println("Item found: " + a[i]);
          }
      }   
    }
}
