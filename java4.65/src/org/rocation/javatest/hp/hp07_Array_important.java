package org.rocation.javatest.hp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// �迭��ġ�� by List, ArrayList
public class hp07_Array_important {

	public static void main(String[] args) {
		Integer []a = {1,3,5,7,9};
		Integer []b = {2,4,6,8,10};
		
		List<Integer> list1 = new ArrayList(Arrays.asList(a)); // �迭 a�� ����Ʈ�� ��ȯ
		List<Integer> list2 = new ArrayList(Arrays.asList(b));
		list1.addAll(list2); // ����Ʈ ����
		
		Integer[] c = list1.toArray(new Integer[0]);  // ����Ʈ�� �ٽ� �迭��
		System.out.println(Arrays.toString(c));
	}

}
