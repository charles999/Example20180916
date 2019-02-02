package test.service.pgm;

public class TrainFromCodewar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean valid(String str) {
		
		final String b11 = "()";
		final String b21 = "[]";
		final String b31 = "{}";
		int len = str.length();
		String s2 = str.substring(0,1) + str.substring(len - 1);
		if(b11.equals(str.substring(0,1)) || b21.equals(str.substring(0,1))
				|| b31.equals(str.substring(0,1))) {
			if(str.length() == 2) {
				return true;
			} else {
			return valid(str.substring(2));
			}
			
		} else if(b11.equals(s2) || b21.equals(s2)
				|| b31.equals(s2)) {
			if(str.length() == 2) {
				return true;
			} else {
				return valid(str.substring(1,len -1));
			}
		} else {
			return false;
		}
		//return true;
	}
	// change time(seconds)to h,m,s
	public static int[] race(int v1, int v2, int g) {
		//int x = 0;
		int x = 3600*g/(v2-v1);
		int m= x/60;
		int h = 0;
		int s = 0;
		if (m < 60) {
			s = x % 60;
		}else {
			h = m/60;
			m = m%60;
			s = x -h*3600 -m*60;
		}
		
		int[] time = {h,m,s};
		return time;
        // your code
    }
	public static double findUniq(double arr[]) {
	      // Do the magic
	      
	      int y = 1;
	      int x = 0;
	      double v = 0;
	      double sam = arr[0];
	      for(int i=1;i< arr.length ;i++){
	        
	        if(sam == arr[i]) {
	          y++;
	        } else {
	          v = arr[i];   
	          x++;
	        }
	        if(y > 1 && x > 0) {
	        	break;
	        }
	      }
	      if (y > x) {
	      return v;
	      }
	      return sam;
	    }
}
