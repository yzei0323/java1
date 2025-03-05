package day13.학생;

public class 권지언_Pirate extends 권지언_Character {

    public 권지언_Pirate(String name) {
        super(name, 45, 35, 3, 180); 
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.max_hp += level * 7; 
    }
}
