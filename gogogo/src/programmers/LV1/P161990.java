package programmers.LV1;

import java.util.HashMap;

public class P161990 {

	public static void main(String[] args) {

		/*
		 * ����
		 * ��ǻ�� ����ȭ���� �� ĭ�� ���簢���� �������Դϴ�. 
		 * �̶� ��ǻ�� ����ȭ���� ���¸� ��Ÿ�� ���ڿ� �迭 wallpaper�� �־����ϴ�. 
		 * ���ϵ��� ����ȭ���� ����ĭ�� ��ġ�ϰ� ����ȭ���� ���������� ����ȭ���� ���� ���� ���� (0, 0)���� ������ (���� ��ǥ, ���� ��ǥ)�� ǥ���մϴ�. 
		 * ��ĭ�� ".", ������ �ִ� ĭ�� "#"�� ���� �����ϴ�. �巡�׸� �ϸ� ���ϵ��� ������ �� �ְ�, ���õ� ���ϵ��� ������ �� �ֽ��ϴ�. 
		 * �Ӿ��̴� �ּ����� �̵��Ÿ��� ���� �� ���� �巡�׷� ��� ������ �����ؼ� �� ���� ������� �ϸ� �巡�׷� ���ϵ��� �����ϴ� ����� ������ �����ϴ�.
		 *  
		 *  ���ѻ���
		 *  1 �� s�� ���� �� 10,000
		 *  s�� ���� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
		 *  
		 */
		
		String[] wallpaper = {".#...", "..#..", "...#."};
		int answer[] = new int[4];
		answer[0] = 999;
		answer[1] = 999;
		answer[2] = -1;
		answer[3] = -1;
		
		for(int i = 0; i<wallpaper.length;i++) {
			int tmp = wallpaper[i].indexOf("#");
			if(tmp>=0) {
				answer[0] = Math.min(answer[0], i);
				answer[1] = Math.min(answer[1], tmp);
				answer[2] = Math.max(answer[2], i+1);
				answer[3] = Math.max(answer[3], wallpaper[i].lastIndexOf("#")+1);
			}
		}
		
		
		
	}
}
