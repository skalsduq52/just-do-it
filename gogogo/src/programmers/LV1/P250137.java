package programmers.LV1;

import java.util.LinkedList;
import java.util.Queue;

public class P250137 {

	public static void main(String[] args) {
		
		int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
		int[] bandage = {5, 1, 5};
		int health = 30;

		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();

		int maxHP = health;
		int count = 0;

		for (int i = 0; i < attacks.length; i++) {
			queue1.offer(attacks[i][0]);
			queue2.offer(attacks[i][1]);
		}

		int attack = 0;
		int damage = 0;
		attack = queue1.poll();
		damage = queue2.poll();

		int hp = 0;

		for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {

			if (i == attack) {
				health -= damage;
				count = 0;
				if (!queue1.isEmpty()) {
					attack = queue1.poll();
					damage = queue2.poll();
				}
			} else {
				count++;
				if (health != maxHP) {
					hp += bandage[1];
					if (count == bandage[0]) {
						hp += bandage[2];
						count = 0;
					}

					if (health + hp > maxHP) {
						health = maxHP;
					} else {
						health += hp;
					}

					hp = 0;
				}
			}

			if (health <= 0) {
				health = -1;
				break;
			}

		}

	}

}
