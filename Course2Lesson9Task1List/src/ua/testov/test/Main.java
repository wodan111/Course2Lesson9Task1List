package ua.testov.test;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		list();
	}
public static void list() {
	List<Integer> listOne = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++) {
		listOne.add((int) (Math.random() * 50));
	}
	//System.out.println(listOne);
	int x = listOne.get(9);
	listOne.remove(0);
	listOne.remove(0);
	listOne.remove(listOne.lastIndexOf(x));
	System.out.println(listOne);
}
}
