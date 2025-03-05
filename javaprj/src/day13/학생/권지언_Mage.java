package day13.학생;

public class 권지언_Mage extends 권지언_Character {

	public 권지언_Mage(String name) {
		super(name, 30, 20, 5, 120); 
	}

	@Override
	public void levelUp() {
		super.levelUp();
		this.max_hp += level * 4;
	}
}
