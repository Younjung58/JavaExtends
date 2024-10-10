package animal_mission;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> ani = new ArrayList<>();
		
		Animal t1 = new Tiger();
		t1.aniName = "호돌이";
		t1.aniAge = 1;
		t1.aniWeight = 40;
		ani.add(t1);
		
		Animal t2 = new Tiger();
		t2.aniName = "호순이";
		t2.aniAge = 2;
		t2.aniWeight = 60;
		ani.add(t2);
		
		Animal m1 = new Monkey();
		m1.aniName = "숭이";
		m1.aniAge = 3;
		m1.aniWeight = 30;
		ani.add(m1);
		
		for(Animal a : ani) {
			System.out.println(a.toString());
			a.feed();
		}
		
	}

}
