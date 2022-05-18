package org.rocation.javatest.hp;

public class hp05_basic_tech {

	public static void main(String[] args) {
		Double w = 150.0;
		Double t = 1.76;
		String name = "Kim";
		
		Double bmi = bmi(w,t);
		String result = result(bmi);
		
		System.out.printf("Bmi: %.1f(%.1fkg, %.1fcm)\n", bmi, w,t);
		System.out.printf("%s는 %s입니다.", name, result);
	}
	public static Double bmi(Double w, Double t) {
		double result = w/(t*t);
		return result;
	}

	public static String result(double bmi) {
		String result= "";
		if(bmi>=30) {
			result = "비만";
		}else if(bmi>=25) {
				result = "과체중";
		}else if(bmi>=18.5) {
				result = "정상";
		}else result = "저체중";
		return result;
		
		
		
	}
	
	

}
