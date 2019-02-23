import java.util.ArrayList;

public class ArraySum {
   public static void main(String[] args) {
       int arr[]= {1, 2, 3, 4, 10, 11};
       int som=0; 
       
       for(int tellen=0;tellen<arr.length;tellen++) {
    	   som+=arr[tellen];
       } 
       
       System.out.println(som);
   }
}
