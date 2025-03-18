package day21.join.실습;


//1~50까지 더하기
public class A extends Thread {
   
   private int sum;
   
   
   
   public int getSum() {
      return sum;
   }


   //1~50까지 더하기
   @Override
   public void run() {
      
      for(int i=1;i<=50;i++) {
         sum+=i;
         System.out.println(getName() + "=" + sum);
      }
      
   }
}