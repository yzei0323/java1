package day13.학생;

public class 권지언_Warrior extends 권지언_Character {

	public 권지언_Warrior(String name) {
		super(name, 50, 30, 3, 200); 
	}

	@Override
	public void levelUp() {
		super.levelUp();
		this.max_hp += level * 10; 
	}
}
