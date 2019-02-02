package test.service.pgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class codeCodility2 {

	public static void main(String[] args) {
		
		int[] A = {1,4,7,3,3,5};

		System.out.println(solution(A));
	}

    public static int solution(int[] A) {
    	List<Integer> lSort = new ArrayList();
    	
    	for(int a : A){
    		lSort.add(a);
    	}
    	Collections.sort(lSort);
    	int distent = 0;
    	for(int i = 0; i < A.length; i++) {
    		for(int x = i +1; x < A.length; x++) {
    			if(A[i] != A[x]) {
    				if(adjacentCheck(lSort,A[i], A[x])) {
    					if (distent < Math.abs(i - x)){
    						distent = Math.abs(i - x);
    					}
    				}
    			}
    		}
    	}
    	if (distent > 0) return distent;
		return -1;
        // write your code in Java SE 8
    }
    
    public static boolean adjacentCheck(List<Integer> ls,int p,int q) {
		for(int y =0 ; y < ls.size() ; y++) {
			if(ls.get(y) == p) {
				if( y == ls.size()-1) {
					if(p > q && ls.get(y - 1) == q) {
						return true;
					} else {
						return false;
					}
				} else {
					if(p > q && ls.get(y - 1) == q) {
						return true;
					} else if(p < q && ls.get(y + 1) == q){
						return true;
					}
					
				}
			}
    	}
    	return false;
    }
}
