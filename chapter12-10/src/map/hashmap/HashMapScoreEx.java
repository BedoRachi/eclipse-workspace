package map.hashmap;

import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("�輺��", 97);
		javaScore.put("Ȳ����", 88);
		javaScore.put("�賲��", 98);
		javaScore.put("���繮", 70);
		javaScore.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ����: " + javaScore.size());
		System.out.println(javaScore.toString());
		Set<String> keys = javaScore.keySet(); //javaScore�� Key List�� ����
		Iterator<String> it = keys.iterator(); //Key List�� �ҷ���
		
		while(it.hasNext()) {//key�� �������� ���� ����
			String name = it.next(); //Ư�� ������ key���� ����
			int score = javaScore.get(name); //key���� value�� ����
			System.out.println(name + " : " + score);
		}
	}

}
