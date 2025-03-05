package day13.학생;

import java.util.Scanner;
import java.util.Random;

public class 권지언_GameMain {

	static boolean characterCreated = false;
	static 권지언_Character character;
	static int monstersDefeated = 0;
	static 권지언_Monster[] monsters = { new 권지언_Monster("고블린", 300, 10, 20), new 권지언_Monster("오크", 700, 15, 30),
			new 권지언_Monster("늑대", 500, 12, 25), new 권지언_Monster("드래곤", 1500, 25, 100), new 권지언_Monster("해골 병사", 400, 14, 35),
			new 권지언_Monster("트롤", 900, 18, 50), new 권지언_Monster("슬라임", 200, 8, 15), new 권지언_Monster("뱀파이어", 800, 20, 60),
			new 권지언_Monster("미노타우로스", 1200, 22, 80), new 권지언_Monster("데몬로드", 2000, 30, 150) };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		while (true) {
			if (!characterCreated) {
				System.out.println("어떤 직업군을 선택하시겠습니까?");
				System.out.println("1.전사 2.법사 3.궁수 4.도적 5.해적");
				int collect = Integer.parseInt(sc.nextLine());

				System.out.println("캐릭터 이름을 입력하세요:");
				String name = sc.nextLine();

				switch (collect) {
				case 1:
					character = new 권지언_Warrior(name);
					break;
				case 2:
					character = new 권지언_Mage(name);
					break;
				case 3:
					character = new 권지언_Archer(name);
					break;
				case 4:
					character = new 권지언_Assassin(name);
					break;
				case 5:
					character = new 권지언_Pirate(name);
					break;
				default:
					System.out.println("잘못된 입력입니다");
					continue;
				}
				characterCreated = true;
				System.out.println("캐릭터가 생성완료!");
			}

			while (true) {
				권지언_Monster monster = monsters[rand.nextInt(monsters.length)];
				System.out.println("몬스터가 등장했습니다: " + monster.name);

				while (monster.hp > 0) {
					System.out.println("1. 공격하기  2. 도망가기");
					int action = Integer.parseInt(sc.nextLine());

					if (action == 1) {
						boolean isCritical = rand.nextInt(100) < 10;
						int baseDamage = character.attack();
						int randomDamage = baseDamage
								+ (rand.nextInt((int) (baseDamage * 0.2 + 1)) - (int) (baseDamage * 0.1));

						if (isCritical) {
							randomDamage *= 2;
							System.out.println("크리티컬 공격!");
						}

						monster.hp -= randomDamage;
						System.out.println(
								character.name + "의 공격! " + monster.name + "에게 " + randomDamage + " 데미지를 입혔습니다.");

						if (monster.hp <= 0) {
							System.out.println(monster.name + "를 처치했습니다! 경험치 +" + monster.expGain);
							character.gainExp(monster.expGain);
							monstersDefeated++;

							if (monstersDefeated % 3 == 0) {
								character.hp = character.max_hp;
								System.out.println("3마리의 몬스터를 처치하여 체력이 최대치로 회복되었습니다!");
							}
							break;
						} else {
							System.out.println(monster.name + "의 남은 체력: " + monster.hp);
						}

						int baseMonsterDamage = monster.attackPower;
						int randomMonsterDamage = baseMonsterDamage
								+ (rand.nextInt((int) (baseMonsterDamage * 0.2 + 1)) - (int) (baseMonsterDamage * 0.1));
						character.hp -= randomMonsterDamage;
						System.out.println(monster.name + "의 반격! " + character.name + "에게 " + randomMonsterDamage
								+ " 데미지를 입혔습니다.");

						if (character.hp <= 0) {
							System.out.println(character.name + "이(가) 쓰러졌습니다... 게임 오버!");
							sc.close();
							System.exit(0);
						} else {
							System.out.println(character.name + "의 남은 체력: " + character.hp);
						}
					} else if (action == 2) {
						System.out.println("무사히 도망쳤습니다! 새로운 몬스터를 찾습니다.");
						break;
					} else {
						System.out.println("잘못된 입력입니다. 다시 선택하세요.");
					}
				}
			}
		}
	}
}
