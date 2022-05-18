package org.rocation.javatest.hp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 배열합치기 by List, ArrayList
public class hp07_Array_important {

	public static void main(String[] args) {
		Integer []a = {1,3,5,7,9};
		Integer []b = {2,4,6,8,10};
		
		List<Integer> list1 = new ArrayList(Arrays.asList(a)); // 배열 a를 리스트로 변환
		List<Integer> list2 = new ArrayList(Arrays.asList(b));
		list1.addAll(list2); // 리스트 병합
		
		Integer[] c = list1.toArray(new Integer[0]);  // 리스트를 다시 배열로
		System.out.println(Arrays.toString(c));
	}

}
