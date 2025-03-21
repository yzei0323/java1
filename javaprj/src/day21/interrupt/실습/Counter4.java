package day21.interrupt.실습;

public class Counter4  extends Thread {
	
	@Override
	public void run() {
		  for (int i = 10; i > 0; i--) {
	           
			  
			  if( isInterrupted()) {
				  System.out.println("인터럽트 발생됨 ");
				  return;
			  }
			  
			  System.out.println( i);
			  //			  
			  for( long x=i; x<4200000000l; x++) ;
			  
			  
			  
			  
	        }
		  
		  
		 
	}

}
