package MergeSort;

import java.util.Arrays;

public class mergesort {	
		
	static String display(int[] tab) {
		return Arrays.toString(tab);
	}
	static int[] right(int[] tab) {
		int[] tab_result = Arrays.copyOfRange(tab, 1, tab.length);		
		return tab_result;
	}
	
	static int[] merge(int val, int[] tab) {
		int[] tab_result = new int[tab.length + 1];
		tab_result[0] = val;
		for (int i = 1; i < tab_result.length; i++) {
			tab_result[i] = tab[i-1];
		}
		return tab_result;
	}
	
	static int[] merge(int[] tab1, int[] tab2) {
		int[] tab_result ;
		if (tab1.length == 0) {tab_result = Arrays.copyOf(tab2, tab1.length  );}
		if (tab2.length == 0) {tab_result = Arrays.copyOf(tab1, tab1.length - 1);}
		if (tab1[0] <= tab2[0]) {
			tab_result = merge(tab1[0], merge(right(tab1),tab2) );
		} else {
			tab_result = merge(tab2, tab1);
		}
		return tab_result;
	}

	public static void main(String[] args) {
		int[] t1 = {3, 4, 7};
		int[] t2 = {1, 2, 5, 9};
		System.out.println(	
		display(t1) + "\n" + 
		display(t2));
		System.out.println(		
		right(t1) + " \n" +
		right(t2));
		System.out.println(
		merge(100, t1) +" \n"+
		merge(100, t2));
		
		System.out.println(merge(t1, t2));

	}

}
