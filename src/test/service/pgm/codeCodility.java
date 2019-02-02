package test.service.pgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class codeCodility {

	public static void main(String[] args) {
		
		int[] A = {5,4,4,5,5,1,1,1,1,1,1,1,1,2};

		System.out.println(solution(A));
	}

    public static int solution(int[] A) {

    	int size = 0;
    	//Create Slice
    	for(int i = 0; i < A.length - 1; i++) {
    		for(int x = i +1; x < A.length; x++) {
    			List<Integer> ls = new ArrayList<Integer>();
    			for(int y = i; y <= x; y++) {
    				ls.add(A[y]);
    			}
				if(biCheck(ls)) {
					if(size < ls.size()) {
						size = ls.size();
					}
					if (ls.size() == 10)System.out.println(ls.toString());
				}
    		}
    	}
    	
		return size;
    }
    
    public static boolean biCheck(List<Integer> ls) {
    	
    	if(ls.size() == 2) return true;
    	
    	int num1 = 0;
    	int num2 = 0;
    	
    	Collections.sort(ls);
    	num1 = ls.get(0);
    	num2 = ls.get(ls.size() - 1);
    	if(num1 == num2) return false;
    	
		for(int i =0 ; i < ls.size(); i++) {
			if(ls.get(i) != num1 && ls.get(i) != num2){
				return false;
			}
    	}
		
    	return true;
    }
}
