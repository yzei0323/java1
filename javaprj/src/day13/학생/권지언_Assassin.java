package day13.학생;

public class 권지언_Assassin extends 권지언_Character{

    public 권지언_Assassin(String name) {
        super(name, 35, 28, 4, 140); 
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.max_hp += level * 5; 
    }
}
