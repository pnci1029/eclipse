package org.rocation.javatest.hp;
class holyknight implements healer, knight{
	String name;
	int HP;
	
	holyknight(String name, int HP){
		this.name = name;
		this.HP = HP;
	}
	public void heal(holyknight target) {
		target.HP +=30;
		System.out.printf("%s�� ü���� ȸ���մϴ� HP: %d\n", this.name, target.HP);
	}
	public void healall(holyknight target) {
		target.HP +=50;
		System.out.printf("��ü ü���� ȸ���մϴ� HP: %d\n",target.HP);
	}
}
interface healer{
	public void heal(holyknight target);
}
interface knight{
	public void healall(holyknight target);
}
public class hp18_interface_basic {
	public static void main(String[] args) {

		holyknight h = new holyknight("Ȧ��", 70);
		h.heal(h);
		h.healall(h);
		
	}
}
