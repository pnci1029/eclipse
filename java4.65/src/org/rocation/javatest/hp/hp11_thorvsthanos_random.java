package org.rocation.javatest.hp;

class hero{
	String name;
	int HP;
	hero(String name, int HP){
		this.name = name;
		this.HP = HP;
	}
	public void attack(hero enemy) {
		while(this.HP >0 && enemy.HP >0) {
			if(Math.random()<0.49) {
			enemy.HP -= 10;
			System.out.printf("%s의 공격!\n\t%s의 HP: %d\n",this.name, enemy.name, enemy.HP);
			} else {
				this.HP -=10;
				System.out.printf("%s의 공격!\n\t%s의 HP: %s\n",enemy.name, this.name, this.HP);
			} 
		}
	}
}

class thor extends hero{
	thor(String name, int HP){
		super(name,HP);
	}
}

class thanos extends hero{
	thanos(String name, int HP){
		super(name, HP);
	}
}
public class hp11_thorvsthanos_random {

	public static void main(String[] args) {
		thor t = new thor("토르", 120);
		thanos nos = new thanos("타노스", 500);
		
		t.attack(nos);
		
	}
}
