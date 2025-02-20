import java.util.Scanner;

public class  Ex02{

   public static void main( String[] args) {   

         int input;
         int randomSu;
         int tryCnt=0;
        
        
       //

       Scanner sc = new Scanner( System.in);
       randomSu =  ( int) ( Math.random() * 100 ) +1;  
       while( true){
              tryCnt++;
              input = sc.nextInt();
              if( input >  randomSu ){
                    System.out.println(" down");
              } else if(  input  < randomSu){
                    System.out.println( "up");
              } else if( input == randomSu) {
                       break;
              }     
       }

      if(tryCnt <= 3){
        System.out.println("snack !! ^^ ");
      }else{
          System.out.println(" correct !! ^^ " +  randomSu);      
     }
   }
}
