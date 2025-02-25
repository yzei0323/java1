package day08;

import java.util.Arrays;
import java.util.Scanner;

public class 출장비1 {

   public static void main(String[] args) {
	   
      PSK.work("박수경", 375120);
      int[] result = PSK.work2("박수경" ,456110);
      
      
      for(int i=0; i<result.length; i++) {
    	  System.out.println(result[i]);
      }
      
   }

}
