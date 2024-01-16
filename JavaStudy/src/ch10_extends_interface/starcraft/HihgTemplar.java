package ch10_extends_interface.starcraft;

public class HihgTemplar extends StarUnit{
	private int shield;
	private int mp;
	
	public HihgTemplar() {
		this("하이템플러", 0, 60, 0, 50, 200);
	}
	
	public HihgTemplar(String name, int damage, int hp, int armor, int shield, int mp) {
		super(name, damage, hp, armor);
		this.shield = shield;
		this.mp = mp;
	}
	
	public void tthunderStorm() {
		mp -= 75;
		System.out.println("우르르 쾅쾅!!");
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	@Override
	public String toString() {
		return "HihgTemplar [shield=" + shield + ", mp=" + mp + ", getName()=" + getName() + ", getDamage()="
				+ getDamage() + ", getHp()=" + getHp() + ", getArmor()=" + getArmor() + "]";
	}
	
	
	
}
