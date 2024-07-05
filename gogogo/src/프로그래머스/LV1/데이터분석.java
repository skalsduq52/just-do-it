package 프로그래머스.LV1;

import java.util.*;
import java.io.*;

public class 데이터분석 {

	public static void main(String[] args) throws IOException {
		
		
		int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
		String ext = "date";
		int val_ext	= 20300501;
		String sort_by = "remain";
		
        HashMap<String,Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<data.length; i++) {
            if (data[i][map.get(ext)] < val_ext) {
                list.add(i);
            }
        }
        int[][] answer = new int[list.size()][4];
        for (int i=0; i<list.size(); i++) {
            answer[i] = data[list.get(i)];
        }
        
        Arrays.sort(answer, new Comparator<int[]>() {
        	public int compare(int[] s1, int[] s2) {
        		return s1[map.get(sort_by)] - s2[map.get(sort_by)];
        	}
        });
        
        
        System.out.println("ho");
        
	}
		
}