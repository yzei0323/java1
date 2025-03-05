package day13.학생;

public class 권지언_Character {
	String name;
	int level;
	int base_attack;
	int weapon_constant;
	int attack_coefficient;
	int damage;
	int hp;
	int max_hp;
	int exp;
	int expToLevelUp;

	public 권지언_Character() {
	}

	public 권지언_Character(String name, int base_attack, int weapon_constant, int attack_coefficient, int max_hp) {
		this.name = name;
		this.level = 1; 
		this.base_attack = base_attack;
		this.weapon_constant = weapon_constant;
		this.attack_coefficient = attack_coefficient;
		this.hp = max_hp;
		this.max_hp = max_hp;
		this.exp = 0;
		this.expToLevelUp = 100; 
	}

	public int attack() {
		this.damage = base_attack * attack_coefficient + weapon_constant;
		return damage;
	}

	public void gainExp(int expGain) {
		this.exp += expGain;
		System.out.println(name + "이(가) " + expGain + " 경험치를 획득했습니다! 현재 경험치: " + exp + "/" + expToLevelUp);
		if (this.exp >= expToLevelUp) {
			levelUp();
		}
	}

	public void levelUp() {
		this.exp -= expToLevelUp;
		this.level++;
		this.expToLevelUp *= 1.2; 
		this.max_hp += level * 5; 
		this.hp = this.max_hp;
		System.out.println(name + "이(가) 레벨업 했습니다! 현재 레벨: " + level + " 최대 체력: " + max_hp);
	}

	public String status() {
		return "캐릭터 이름: " + name + "\n레벨: " + level + "\n총 공격력: " + damage + "\n체력: " + hp + "/" + max_hp;
	}
}
