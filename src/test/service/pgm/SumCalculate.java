package test.service.pgm;

import java.math.BigDecimal;

public class SumCalculate {

		
		public static String seriesSum(int n) {
			// Happy Coding ^_^		
	    Double d = 1.00;
	    if (n > 1){
	      for(int i = 1;i < n ;i++){
	    	  //BigDecimal a = new BigDecimal("1.00");//(double) 1/(1+ 3*n);
	    	  int divi = 1 + 3*i;
	    	  BigDecimal b = new BigDecimal((float)1/divi);
	    	  //a = a.divide(b);
	    	  System.out.println("b :" + b);
	    	  double add = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	          d += add; 
	          BigDecimal ot = new BigDecimal(d);
	          System.out.println("add :" + ot.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
	      }
	    }
	    return d.toString();
		}
		
		public static String seriesSum2(int n) {
			// Happy Coding ^_^		
	    Double d = 1.00;
	    if (n > 1){
	      for(int i = 1;i < n ;i++){
	    	  //BigDecimal a = new BigDecimal("1.00");//(double) 1/(1+ 3*n);
	    	  int divi = 1 + 3*i;
	    	  float b = ((float)1/divi);
	    	  //a = a.divide(b);
	    	  System.out.println("b :" + b);
	    	  //double add = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	          d += b; 
	          
      }
	    }
	    return String.format("%.2f", d);
	}
	public static int calc() {
		int sum = 0;
		for(int i =1 ;i < 1000;i++) {
			int x3 = i%3;
			int x5 = i%5;
			if (x3 == 0 || x5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
