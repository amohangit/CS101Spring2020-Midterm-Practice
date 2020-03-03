/*
   This code was developed by Professor Mohan. 
   All work is mine unless otherwise cited. 

*/

import java.util.Arrays;
import java.util.Random;
public class ArrayProcessor{
   private static int[] array;
   private static int size = 0;
   private static int capacity = 5;
   public static void fillArray(){
      Random rand = new Random(); 
      while(true){
         for (int i = size; i < array.length; i++){
               array[i] = rand.nextInt(100);
               size++;
           
         }
         /* prompt the user if they want to make the array big */
         /* if the user want the array to be big double the array size */
         /* quit the while loop otherwise */
         
      }
      


      
   }
   public static void goBig(){
      /* double the array size here */
      System.out.println("Making it bigger");
   }
   public static void main(String[] args){
      array = new int[capacity]; 
      fillArray();
      
      System.out.println(Arrays.toString(array));


      

   }
}