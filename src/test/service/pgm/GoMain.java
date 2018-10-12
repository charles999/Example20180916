package test.service.pgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GoMain {

	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub11
		System.out.println("Hellow");
//		List<String> l1 = new ArrayList<String>();
//		//InputStream is = new InputStream();
//		InputStreamReader ir = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(ir);
//		String flg = "";
//		
//		while(!flg.equals("over")) {
//			flg = br.readLine(); 
//
//			l1.add(flg);
//			if (l1.size() > 5) {
//				flg = "over";
//			}
//		}
//		for(String str : l1) {
//			System.out.println("out put : " + str);
//					
//		}
		SumCalculate sc = new SumCalculate();
//		System.out.println(sc.seriesSum(5));
//		System.out.println(sc.seriesSum(9));
//		System.out.println(sc.seriesSum(15));
		System.out.println(sc.seriesSum2(5));
		System.out.println(sc.seriesSum2(9));
		System.out.println(sc.seriesSum2(15));
		System.out.println(sc.calc());
	}
	public static String[] inArray(String[] array1, String[] array2) {
		String str1 = array1[0];
		System.out.println(str1.length());
		 return new String[] { "arp" };
	}

}
