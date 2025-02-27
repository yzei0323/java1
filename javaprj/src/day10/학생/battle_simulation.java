package day10.학생;

public class battle_simulation {

	public static void main(String[] args) throws InterruptedException {

		Character user = new Character();
		Monster monster = new Monster();
		Battle battle = new Battle();

		// 유저
		user.nick();
		user.weapon();
		user.random();
		user.info();
		
		Thread.sleep(2000);

		// 몬스터
		monster.random();
		monster.displayMonster();
		
		Thread.sleep(2000);

		// 전투과정
		battle.battle(user, monster);
	}

}
