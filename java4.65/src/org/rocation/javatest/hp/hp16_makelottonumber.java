package org.rocation.javatest.hp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 45까지 수 중에서 6개 랜덤으로 뽑기
public class hp16_makelottonumber {
	public static void main(String[] args) {
		
		ArrayList<Integer> lotto = new ArrayList<>();
		for(int i =1; i<=45; i++) {
		lotto.add(i);
		}		
		Collections.shuffle(lotto);
		
		int [] picked = new int[6];
		
		for(int i =0; i<picked.length; i++) {
			picked[i] = lotto.get(i);
		}
		
		System.out.printf("자동생성번호: %s", Arrays.toString(picked));
		
	}
}
