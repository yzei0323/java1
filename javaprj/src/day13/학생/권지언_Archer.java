package day13.학생;

public class 권지언_Archer extends 권지언_Character {

    public 권지언_Archer(String name) {
        super(name, 40, 25, 4, 150); 
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.max_hp += level * 6;
    }
}
