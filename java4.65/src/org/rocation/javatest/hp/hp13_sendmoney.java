package org.rocation.javatest.hp;
class account{
	String name;
	int money;
	account(String name, int money){
		this.name = name;
		this.money = money;
	}
	void send(account target){
		
		while(target.money >=0 && this.money>=0) {
			if(Math.random()<0.5) {
				target.money += 3000;
				this.money -=3000;
				System.out.printf("%s°¡ %s¿¡°Ô 3000¿øÀ» º¸³Â½À´Ï´Ù.\n\t%s ÀÜ°í: %d\n\t%s ÀÜ°í: %d\n", this.name, target.name, target.name, target.money, this.name, this.money);	
			} else {
				this.money += 3000;
				target.money -=3000;
				System.out.printf("%s°¡ %s¿¡°Ô 3000¿øÀ» º¸³Â½À´Ï´Ù.\n\t%s ÀÜ°í: %d\n\t%s ÀÜ°í: %d\n", target.name, target.name, this.name, this.money, target.name, target.money);
			}
		}
		
	}
}
public class hp13_sendmoney {
	public static void main(String[] args) {
		account a = new account("a", 10000);
		account b = new account("b", 10000);
		
		a.send(b);
		
	}
}
