package org.rocation.javatest.hp;
class box {
	String name;
	int length;
	box(String name, int length){
		this.name = name;
		this.length = length;
	}
	void calculate(int a){
		int v = a*a*a;
		int l = 6*a*a;
		
		System.out.printf("¡§¿∞∏È√º %s¿« ∫Œ««: %s, ∞—≥–¿Ã: %s\n",this.name, v,l );
	}
}
public class hp13 {
	public static void main(String[] args) {
		box a = new box("a", 3);
		box b = new box("b", 5);
		
		a.calculate(3);
		b.calculate(5);
	
	}
}
