package org.rocation.javatest.hp;
class star{
	String name;
	int HP;
	public star(String name, int HP) {
		this.name=name;
		this.HP = HP;
	}
}
class marine extends star{
	marine(String name, int HP) {
		super(name,HP);
	}
	void steampack() {
		this.HP -=10;
		System.out.printf("%sÀÇ ½ºÆÀÆÑ!\n\t%sÀÇ HP: %d\n",this.name, this.name,this.HP);
	}
}
class medic extends star{
	int MP;
	medic(String name, int HP, int MP){
		super(name,HP);
		this.MP = MP;
	}
	void heal(star target){
		target.HP +=10;
		this.MP -=10;
		System.out.printf("%sÀÇ Èú!\n\t%sÀÇ HP: %d\n\tMP: %d\n",this.name, target.name, target.HP, this.MP);
	}
}

public class hp12_class_basic {

	public static void main(String[] args) {
		marine m = new marine("·¹ÀÌ³Ê", 80);
		medic dic = new medic("¸ð¶ö·¹½º", 30, 90);
		m.steampack();
		m.steampack();
		dic.heal(m);
		dic.heal(m);
		dic.heal(m);
		dic.heal(m);
		dic.heal(m);
		dic.heal(m);
		
	}

}
